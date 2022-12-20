package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OvoinController {

	
	@RequestMapping("/seoyeon/seoyeon_view")
	public ModelAndView seoyeon_view() {
		ModelAndView mv = new ModelAndView();
			
		mv.setViewName("seoyeon/seoyeon_view");
		return mv;
	}
}
