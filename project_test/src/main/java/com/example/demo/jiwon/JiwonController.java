package com.example.demo.jiwon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JiwonController {
	
	@RequestMapping("/jiwon/jiwon_view")
	public ModelAndView jiwon_view() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jiwon/jiwon_view");
		return mv;
	}
	
}	
