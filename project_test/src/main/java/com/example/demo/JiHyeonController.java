package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JiHyeonController {
		@RequestMapping("/jihyeon/jihyeon_view")
		public ModelAndView index() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("jihyeon/jihyeon_view");
			return mv;
		}
	}

