package com.myweb.board.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.board.service.WebMainService;
import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

import java.util.Map;

@Controller
public class WebMainController {

	@Autowired
	WebMainService webMainService;

	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);

	/*
	 * 로그인
	 * */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String getMain() throws Exception {

		logger.info("main GET Controller >>>>>>>>>");

		return "/main";
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public ModelAndView postMain(ModelAndView modelAndView, Model model, LogInVO vo, HttpSession session,RedirectAttributes rttr) throws Exception {
	
		logger.info("main POST Controller >>>>>>>>>");
	
		LogInVO login = webMainService.login(vo);
		System.out.println(login);
	
		ModelAndView mav = new ModelAndView();
		logger.info("login", login);
	
		if (login != null) {
			model.addAttribute("login", login);
			mav.setViewName("redirect:/main");
		} else {
			mav.setViewName("redirect:/test");
		}
		return mav;
	
	}

	/*
	* 회원가입
	* */
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String getJoin() throws Exception {

		logger.info("Join GET Controller >>>>>>>>>");

		return "/join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView postJoin(@RequestParam Map<String, Object> map, HttpSession session) throws Exception {

		logger.info("Join Post Controller >>>>>>>>>" + map);
		ModelAndView mav = new ModelAndView();

		String poJoin = webMainService.join(map);

		if (poJoin == null) {
			mav.setViewName("redirect:/login");
		} else {
			mav.setViewName("redirect:/join");
		}

		return mav;

//		return "/join";
	}

}
