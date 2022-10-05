package com.myweb.board.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.board.service.WebServiceMain;
import com.myweb.board.vo.LogInVO;

@Controller
public class WebMainController {

	@Autowired
	WebServiceMain webServiceMain;

	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);

	// 로그인 화면(GET)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMain() throws Exception {

		logger.info("main GET Controller >>>>>>>>>");

		return "/test";
	}

	// 로그인 화면(POST)
		@RequestMapping(value = "/", method = RequestMethod.POST)
		public ModelAndView postMain(Model model, ModelAndView modelAndView, LogInVO vo ,HttpSession session, RedirectAttributes rttr) throws Exception {
	
			logger.info("main POST Controller >>>>>>>>>");
	
			ModelAndView mav = new ModelAndView();
	
			LogInVO login = webServiceMain.login(vo);

			if (login == null) {
				mav.setViewName("redirect:/test");
			} else {
				mav.setViewName("redirect:/main");
			}
			return mav;
	
		}

	/*	
			// 회원가입 화면(GET)
			@RequestMapping(value = "/join", method = RequestMethod.GET)
			public String getJoin() throws Exception {
	
				logger.info("Join GET Controller >>>>>>>>>");
				
				return "/join";
			}
			
			// 로그인 화면(POST)
			@RequestMapping(value = "/join", method = RequestMethod.POST)
			public ModelAndView postJoin(Model model, ModelAndView modelAndView, LogInVO vo ,HttpSession session, RedirectAttributes rttr) throws Exception {
	
				logger.info("Join POST Controller >>>>>>>>>");
	
				ModelAndView mav = new ModelAndView();
	
				
				return mav;
			}*/

}
