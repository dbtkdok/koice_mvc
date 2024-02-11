package com.myWebShop.member.service;

import java.util.List;
import java.util.Map;

import com.myWebShop.member.vo.MemberVO;

public interface MemberService {

	public MemberVO login(MemberVO member) throws Exception;

	public void addMember(MemberVO member) throws Exception;
	
	public void addFiles(Map<String, Object> param) throws Exception;
	
	public List<MemberVO> pado_text(MemberVO member) throws Exception;
	
	public void addTexts(Map<String, Object> param) throws Exception;
}
