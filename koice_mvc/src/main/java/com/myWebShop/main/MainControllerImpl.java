package com.myWebShop.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myWebShop.item.service.ItemService;
import com.myWebShop.member.service.MemberService;
import com.myWebShop.member.vo.MemberVO;

@Controller("mainController")
public class MainControllerImpl implements MainController{
	
	@Autowired
	MemberVO memberVO;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
	public  ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping(value = "/**.do", method = {RequestMethod.GET,RequestMethod.POST})
	public  ModelAndView comMainFrame(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		String viewName=(String)request.getAttribute("viewName");
		mav.setViewName(viewName);
		
		return mav;
	}

	@Override
	@RequestMapping(value = "/login.do", method = {RequestMethod.GET})
	public ModelAndView login(MemberVO member, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		String viewName=(String)request.getAttribute("viewName");
		
		if(session.getAttribute("member") != null) {
			mav.setViewName("redirect:/dashboard.do");
		} else {
			mav.setViewName(viewName);
		}
		
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value = "/login_form.do", method = {RequestMethod.POST})
	public ModelAndView login_form(MemberVO member, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ResponseEntity<String> r = null;
		
		request.setCharacterEncoding("utf-8");
		//System.out.println(member.getMember_id());
		ModelAndView mav = new ModelAndView();
		memberVO = memberService.login(member);
		//System.out.println(memberVO);
		if(memberVO != null) {
			HttpSession session = request.getSession();
		    session.setAttribute("member", memberVO);
		    session.setAttribute("isLogOn", true);
		    String action = (String)session.getAttribute("action");
		    session.removeAttribute("action");
		    
		    mav.setViewName("redirect:/dashboard.do");
		} else {
			   mav.addObject("result", "fail");
			   mav.setViewName("login");
		}
		r = new ResponseEntity<String>(HttpStatus.OK);
		
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value = "/logout.dw", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView logout(MemberVO member, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		ModelAndView mav = new ModelAndView();
		
		session.removeAttribute("member");
		mav.setViewName("redirect:/");
		
		return mav;
	}
}
