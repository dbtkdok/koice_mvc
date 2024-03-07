package com.myWebShop.member.service;

import java.util.List;
import java.util.Map;

import com.myWebShop.member.vo.FileVO;
import com.myWebShop.member.vo.MemberVO;

public interface FileService {
	
	public List<FileVO> file_list(FileVO files) throws Exception;
	
	public FileVO file_one(FileVO files) throws Exception;
}
