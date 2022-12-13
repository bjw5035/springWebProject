package com.myweb.board.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.board.service.WebMainService;
import com.myweb.board.vo.LogInVO;

@Controller
public class WebMainController {

	@Autowired
	WebMainService webMainService;

	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);

	// 로그인 화면(GET)
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getMain(Model model, ModelAndView modelAndView) throws Exception {

		logger.info("main GET Controller >>>>>>>>>");

		return "/test";
	}

	// 로그인 화면(POST)
		@RequestMapping(value = "/test", method = RequestMethod.POST)
		public @ResponseBody ModelAndView postMain(ModelAndView modelAndView, Model model, LogInVO vo , HttpSession session, RedirectAttributes rttr) throws Exception {


			logger.info("main POST Controller >>>>>>>>>");

			LogInVO login = webMainService.login(vo);
			System.out.println(login);

			ModelAndView mav = new ModelAndView();
			logger.info("login", login);

			if (login != null) {
				model.addAttribute("login", login);
//				System.out.println(login);
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
			
						// 회원가입 화면(POST)
						@RequestMapping(value = "/join", method = RequestMethod.POST)
						public ModelAndView postJoin(Model model, ModelAndView modelAndView, LogInVO vo ,HttpSession session, RedirectAttributes rttr) throws Exception {
			
							logger.info("Join POST Controller >>>>>>>>>");
			
							ModelAndView mav = new ModelAndView();
			
			
							return mav;
						}
			*/
}
