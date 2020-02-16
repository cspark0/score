package org.springframework.samples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.Command;
import org.springframework.samples.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/") 
@SessionAttributes("command")
public class SearchController {
	@Autowired
	private SearchService memberService;
	public void setMemberService(SearchService memberService) {
		this.memberService = memberService;
	}

	@ModelAttribute("command")
	public Command formBacking() {
		return new Command();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form1(Model model) {		
		model.addAttribute("message", "");
		return "form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit1(@ModelAttribute("command") Command comm, Model model) {
		if (comm.getCode()==null || comm.getCode().isEmpty() || comm.getSubject()==null || comm.getSubject().isEmpty()) {
			model.addAttribute("message", "");			
			return "form";
		}
		memberService.getScore(comm);
		if (comm.getScore() == null) {
			model.addAttribute("message", "肄붾뱶媛� 議댁옱�븯吏� �븡�뒿�땲�떎!");
			return "form";
		}
		else if (comm.getScore().equals("duplicated")) {
			model.addAttribute("message", "");			
			return "form2";
		}		 
		return "result";
	}	
	
	@RequestMapping("/hakbun") 
	public String submit2(@ModelAttribute("command") Command comm, Model model) {
		if (comm.getHakbun()==null || comm.getHakbun().isEmpty()) {
			model.addAttribute("message", "");			
			return "form2";
		}
		memberService.getScore2(comm);
		if (comm.getScore() == null) {
			model.addAttribute("message", "�븰踰덉씠 議댁옱�븯吏� �븡�뒿�땲�떎!");
			return "form2";
		}
		return "result";
	}
}