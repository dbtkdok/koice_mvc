package com.myWebShop.commons.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.myWebShop.member.service.MemberService;

import net.coobird.thumbnailator.Thumbnails;


@Controller
public class FileDownloadController {
	
	@Autowired
	MemberService memberService;
	
	//private static String CURR_IMAGE_REPO_PATH = "/Users/leeyusang/Desktop/"; // mac
	private static String CURR_IMAGE_REPO_PATH = "/tomcat/webapps/files/"; //실제서버용  
	
	@RequestMapping("/download")
	protected void download(@RequestParam("fileName") String fileName,
		                 	@RequestParam("item_id") String item_id,
		                 	HttpServletRequest request, HttpServletResponse response) throws Exception {
		OutputStream out = response.getOutputStream();
		String filePath=CURR_IMAGE_REPO_PATH + fileName;
		File image=new File(filePath);
		
		response.setContentType("application/octet-stream");
		response.setHeader("Cache-Control","no-cache");
		response.setHeader("Content-Transfer-Encoding", "binary");
		response.addHeader("Content-disposition", "attachment; fileName="+ URLEncoder.encode(fileName,"UTF-8"));
		FileInputStream in=new FileInputStream(image); 
		byte[] buffer=new byte[1024*8];
		
		while(true){
			int count=in.read(buffer); //���ۿ� �о���� ���ڰ���
			if(count==-1)  //������ �������� �����ߴ��� üũ
				break;
			out.write(buffer,0,count);
		}

		in.close();
		out.close();
	}
	
	@RequestMapping("/upload")
    public String fileUploadMultiple(@RequestParam("uploadFileMulti") ArrayList<MultipartFile> files, Model model) throws Exception, IOException {
        String savedFileName = "";
        
        
        // 1. 파일 저장 경로 설정 : 실제 서비스되는 위치(프로젝트 외부에 저장)
        String uploadPath = "/Users/leeyusang/Desktop/data_files/";
        // 여러 개의 원본 파일을 저장할 리스트 생성
        ArrayList<String> originalFileNameList = new ArrayList<String>();
        for(MultipartFile file : files) {
        	String originalFileName = file.getOriginalFilename();
            String extension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
            UUID uuid = UUID.randomUUID();
            savedFileName = uuid.toString() + "." + extension;
            
        	Map<String, Object> map = new HashMap<String, Object>();
        	map.put("file_type", extension);
        	map.put("file_no", "FILES");
        	map.put("file_size", file.getSize());
        	map.put("file_name", savedFileName);
        	map.put("origin_file_NM", originalFileName);
        	map.put("file_path", CURR_IMAGE_REPO_PATH);
        	
        	//System.out.println("map ::::: " + map);
        	memberService.addFiles(map);
            // 5. 파일 생성
        	File file1 = new File(uploadPath + savedFileName);
            // 6. 서버로 전송
            file.transferTo(file1);
        }
        model.addAttribute("result", "ok");
        
        return "example_files";
    }
	
	
	@RequestMapping("/thumbnails.do")
	protected void thumbnails(@RequestParam("fileName") String fileName,
                            	@RequestParam("item_id") String item_id,
			                 HttpServletResponse response) throws Exception {
		OutputStream out = response.getOutputStream();
		String filePath=CURR_IMAGE_REPO_PATH+"\\"+item_id+"\\"+fileName;
		File image=new File(filePath);
		
		int lastIndex = fileName.lastIndexOf(".");
		String imageFileName = fileName.substring(0,lastIndex);
		if (image.exists()) { 
			Thumbnails.of(image).size(121,154).outputFormat("png").toOutputStream(out);
		}
		byte[] buffer = new byte[1024 * 8];
		out.write(buffer);
		out.close();
	}
}
