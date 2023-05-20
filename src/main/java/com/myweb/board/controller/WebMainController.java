package com.myweb.board.controller;

import com.myweb.board.service.WebMainService;
import com.myweb.board.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class WebMainController {

	@Autowired
	WebMainService webMainService;

	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getRoot() throws Exception {

		logger.info("Root GET Controller >>>>>>>>>");

		return "main";
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postRoot() throws Exception {

		logger.info("Root Post Controller >>>>>>>>>");

		return "main";
	}

	/*
	 * 로그인
	 * */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() throws Exception {

		logger.info("Login GET Controller >>>>>>>>>");

		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(Model model, MemberVO memberVO, HttpSession session) throws Exception {

		logger.info("Login Start >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String memberVO1 = webMainService.login(memberVO);

		if (!memberVO1.equals(webMainService.login(memberVO))) {
			return "redirect:/login";
		} else {
			session.setAttribute("userId", memberVO.getUserId());
			return "redirect:/";
		}
	}

	/*
	 * 로그아웃
	 * */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String getLogout() throws Exception {

		logger.info("Logout GET Controller >>>>>>>>>");

		return "logout";
	}
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String postLogout(Model model, MemberVO memberVO, HttpSession session) throws Exception {

		logger.info("Logout POST Controller >>>>>>>>>");

		return "logout";
	}

	/*
	* 회원가입
	* */
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String getJoin() throws Exception {

		logger.info("Join GET Controller >>>>>>>>>");

		return "join";
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

	/*
	* 게시판 등록
	* */
	@RequestMapping(value = "/boardWrite", method = RequestMethod.GET)
	public String getBoardInsert() throws Exception {

		logger.info("boardInsert GET Controller >>>>>>>>>");

		return "boardWrite";
	}
	@RequestMapping(value = "/boardWrite", method = RequestMethod.POST)
	public ModelAndView postBoardInsert(@RequestParam Map<String, Object> map, HttpSession session) throws Exception {

		logger.info("boardInsert Post Controller >>>>>>>>>" + map);
		session.getAttribute("userId");
		String boardInsert = webMainService.boardInsert(map);

		ModelAndView mav = new ModelAndView();
		if (map != null) {
			mav.setViewName("redirect:/");
		} else {
			mav.setViewName("redirect:boardWrite");
		}

		return mav;
	}

}
