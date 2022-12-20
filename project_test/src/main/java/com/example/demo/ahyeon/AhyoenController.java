package com.example.demo.ahyeon;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class AhyoenController {
	
	@RequestMapping("/ahyeon/ahyeon_view")
	public ModelAndView ahyeon() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ahyeon/ahyeon_view");
        return mv;
	}
}
