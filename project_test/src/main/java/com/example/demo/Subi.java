package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Subi {
		@RequestMapping("/subi/subi_view")
		public ModelAndView index() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("subi/subi");
			return mv;
		}
	}

