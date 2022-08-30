package com.myweb.board.controller;

import com.myweb.board.dao.WebMainDao;
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

	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);
	
	
	// 로그인 화면(GET)
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String getMain() throws Exception {

		logger.info("main GET Controller >>>>>>>>>");
		
		return "/main";
	}

	// 로그인 화면(POST)
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public ModelAndView postMain(Model model, ModelAndView modelAndView, HttpSession session, LogInVO vo, RedirectAttributes rttr) throws Exception {

		logger.info("main POST Controller >>>>>>>>>");

		String login = webServiceMain.login(vo);

		ModelAndView mav = new ModelAndView();

		// login이 빈값이 아니면
		if (vo.equals(login)) {
			// session에 login을 담는다.
			session.setAttribute("login", vo);

			// main 화면을 보여준다.
			mav.setViewName("redirect:/main");
		} else {
//			session.setAttribute("msg", null);

		}
		return mav;

	}

}
