package com.myweb.board.controller;

import com.myweb.board.service.WebServiceMain;
import com.myweb.board.vo.LogInVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class WebMainController {

	@Autowired
	WebServiceMain webServiceMain;

	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);


	/*
		메인페이지 및 home화면
		 * */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String getMain() throws Exception {

		logger.info("main GET Controller >>>>>>>>>");
		return "main";
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public ModelAndView postMain(Model model, ModelAndView modelAndView, HttpSession session, LogInVO vo, RedirectAttributes rttr) throws Exception {

		logger.info("main POST Controller >>>>>>>>>");

		ModelAndView mav = new ModelAndView();
		if (mav == null) {
			session.setAttribute("msg", null);
			mav.setViewName("redirect:/main");
		} else {
			session.setAttribute("vo", vo);
			mav.setViewName("redirect:/page_isErrorPage_error");

		}
		return mav;

	}

}
