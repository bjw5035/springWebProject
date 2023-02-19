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

import java.util.List;
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
	public ModelAndView postMain(ModelAndView modelAndView, Model model, @RequestParam Map<String, Object> map, HttpSession session,RedirectAttributes rttr) throws Exception {
	
		logger.info("main POST Controller >>>>>>>>>");
	
		List<Object> login = webMainService.login(map);
		logger.info("controller login >>>> ", login);

		ModelAndView mav = new ModelAndView();

		mav.addAllObjects(map);
		mav.setViewName("/list");

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

	/*
	method = RequestMethod.POST : http 메소드는 POST 방식으로 처리한다.
	@RequestParam : HTTP 파라미터를 map 변수에 자동으로 바인딩한다.
	                HTTP 파라미터는 브라우저에서 서버로 전달하는 데이터를 말한다. (예: 책을 입력할때 제목,분류 등의 정보가 서버로 전달되며 이것을 파라미터라한다.)
	                map타입의 경우는 예외로 @RequestParam을 붙여야만 HTTP파라미터의 값을 map안에 바인딩해 준다.
	* */
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView postJoin(@RequestParam Map<String, Object> map, HttpSession session) throws Exception {

		logger.info("Join Post Controller >>>>>>>>>" + map);
		ModelAndView mav = new ModelAndView();

		String poJoin = webMainService.join(map);

		if (poJoin == null) {
			mav.setViewName("redirect:/main");
		} else {
			mav.setViewName("redirect:/join");
		}

		return mav;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList() throws Exception {

		logger.info("List GET Controller >>>>>>>>>");

		return "/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ModelAndView postList(@RequestParam Map<String, Object> map, HttpSession session) throws Exception {

		logger.info("List Post Controller >>>>>>>>>" + map);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:list");


		return mav;
	}

}
