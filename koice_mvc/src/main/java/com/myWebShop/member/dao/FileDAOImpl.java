package com.myWebShop.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myWebShop.member.vo.FileVO;

@Repository("fileDAO")
public class FileDAOImpl implements FileDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<FileVO> file_list(FileVO files) throws DataAccessException {
		List<FileVO> file_list= sqlSession.selectList("mapper.files.file_list", files);
		return file_list;
	}

	@Override
	public FileVO file_one(FileVO files) throws DataAccessException {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("mapper.files.file_one", files);
	}
}
