package kr.co.reo.client.member.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.reo.client.member.impl.MemberDAO;
import kr.co.reo.common.MemberDTO;

@Controller
public class UserController {
	@Autowired
	private MemberDAO memberDAO;
	
	@RequestMapping(value= "/join.reo")
	public String joinGET(MemberDTO memberDTO) {
		return "client/member/join";
	}
	
	@RequestMapping(value = "/join.reo", method = RequestMethod.POST)
	public String JoinPOST(@Valid @ModelAttribute MemberDTO memberDTO, BindingResult result) throws Exception {
		System.out.println(result);
		if(result.hasErrors()) {
			System.out.println("에러발생");
			return "client/member/join";
		}else {
			System.out.println("회원가입성공");
			memberDAO.insertUser(memberDTO);
			return "client/member/login";
		}
	}
	
	@RequestMapping(value = "/login.reo")
	public String loginGET(@ModelAttribute MemberDTO dto) throws Exception {
		return "client/member/login";
	}
}
