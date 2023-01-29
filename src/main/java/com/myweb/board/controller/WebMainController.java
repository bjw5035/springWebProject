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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.board.service.WebMainService;
import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

@Controller
public class WebMainController {

	@Autowired
	WebMainService webMainService;

	// 로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);

	// 로그인 화면(GET)
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String getMain(Model model, ModelAndView modelAndView) throws Exception {

		logger.info("main GET Controller >>>>>>>>>");

		return "/main";
	}

	// 로그인 화면(POST)
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
	/*public List<String> postMain(Model model, LogInVO vo, RedirectAttributes rttr) {
		
		try {
			List<String> login = (List<String>)webMainService.login(vo);
			System.out.println(login);
			
			if(login != null) {
				System.out.println(">>>>>>>>>>>>Not Null");
			} else {
				System.out.println(">>>>>>>>>>>>Null");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (List<String>) vo;
	}
	*/
	// 회원가입 화면(GET)
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void getJoin() throws Exception {

		logger.info("Join GET Controller >>>>>>>>>");

		return;
	}

	// 회원가입 화면(POST)
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public void postJoin(Model model, MemberVO vo1 ,HttpSession session, RedirectAttributes rttr) throws Exception {

		System.out.println("controller ===> " + vo1);

		return;
	}

}
