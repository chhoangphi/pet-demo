package com.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petshop.dao.HomeDao;



@Controller
public class HomeController {
	@Autowired
	HomeDao homeDao;
	
	@RequestMapping(value = {"/trang-chu" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("customer/home");
		mv.addObject("products", homeDao.GetDataSlide());
		return mv;
	}
}
