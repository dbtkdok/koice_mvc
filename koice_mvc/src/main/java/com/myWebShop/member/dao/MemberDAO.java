package com.myWebShop.member.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myWebShop.member.vo.MemberVO;

public interface MemberDAO {

	public MemberVO login(MemberVO member) throws DataAccessException;

	public void addMember(MemberVO member) throws DataAccessException;
	
	public void addFiles(Map<String, Object> param) throws DataAccessException;
	
	public List<MemberVO> pado_text(MemberVO member) throws DataAccessException;
	
	public void addTexts(Map<String, Object> param) throws DataAccessException;
}
