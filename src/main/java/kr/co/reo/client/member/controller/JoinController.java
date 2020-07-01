package kr.co.reo.client.member.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.co.reo.common.MemberDTO;

@Controller
public class JoinController {
	
	@RequestMapping(value = "/join.reo")
	public String JoinGET(@ModelAttribute MemberDTO dto, Model model) throws Exception {
		int ran = new Random().nextInt(900000) + 100000;
		model.addAttribute("random", ran);
		return "client/member/join";
	}
}
