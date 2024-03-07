package com.myWebShop.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myWebShop.member.vo.FileVO;

public interface FileDAO {

	public List<FileVO> file_list(FileVO files) throws DataAccessException;
	
	public FileVO file_one(FileVO files) throws DataAccessException;
}
