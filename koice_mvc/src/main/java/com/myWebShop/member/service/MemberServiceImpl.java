package com.myWebShop.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myWebShop.member.dao.MemberDAO;
import com.myWebShop.member.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public MemberVO login(MemberVO member) throws Exception {
		
		return memberDAO.login(member);
	}

	@Override
	public void addMember(MemberVO member) throws Exception {
		
		memberDAO.addMember(member);
	}

	@Override
	public void addFiles(Map<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.addFiles(param);
	}

	@Override
	public List<MemberVO> pado_text(MemberVO member) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.pado_text(member);
	}

	@Override
	public void addTexts(Map<String, Object> param) throws Exception {
		
		memberDAO.addTexts(param);
	}
}
