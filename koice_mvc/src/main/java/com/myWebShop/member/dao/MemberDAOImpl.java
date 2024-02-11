package com.myWebShop.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myWebShop.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public MemberVO login(MemberVO member) throws DataAccessException {
		MemberVO memberid= (MemberVO) sqlSession.selectOne("mapper.member.login", member);
		return memberid;
	}


	@Override
	public void addMember(MemberVO member) throws DataAccessException {
		
		sqlSession.insert("mapper.member.addMember", member);;
	}


	@Override
	public void addFiles(Map<String, Object> param) throws DataAccessException {
		// TODO Auto-generated method stub
		sqlSession.insert("mapper.member.addFiles", param);
	}


	@Override
	public List<MemberVO> pado_text(MemberVO member) throws DataAccessException {
		List<MemberVO> memberid= sqlSession.selectList("mapper.member.pado_text", member);
		return memberid;
	}
	
	@Override
	public void addTexts(Map<String, Object> param) throws DataAccessException {
		// TODO Auto-generated method stub
		sqlSession.insert("mapper.member.addTexts", param);
	}
}
