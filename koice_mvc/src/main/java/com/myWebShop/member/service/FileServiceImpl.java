package com.myWebShop.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myWebShop.member.dao.FileDAO;
import com.myWebShop.member.vo.FileVO;

@Service("fileService")
public class FileServiceImpl implements FileService{
	
	@Autowired
	FileDAO fileDAO;

	@Override
	public List<FileVO> file_list(FileVO files) throws Exception {
		// TODO Auto-generated method stub
		return fileDAO.file_list(files);
	}

	@Override
	public FileVO file_one(FileVO files) throws Exception {
		// TODO Auto-generated method stub
		return fileDAO.file_one(files);
	}
	
	
}
