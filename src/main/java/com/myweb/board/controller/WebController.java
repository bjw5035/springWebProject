package com.myweb.board.controller;

import java.util.Map;

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

import com.myweb.board.service.WebService;
import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;
import com.myweb.board.vo.MyModifyVO;

@Controller
public class WebController {

	@Autowired
	WebService webservice;

	private static final Logger logger = LoggerFactory.getLogger(WebController.class);


	/*
	 * Welcome 페이지
	 * */
/*
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcome() throws Exception {

		return "/welcome";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String postWelcome() throws Exception {

		return "/welcome";
	}
*/

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

//		String login = WebService.login(vo);

		ModelAndView mav = new ModelAndView();
		if (mav == null) {
			//			session.setAttribute("msg", null);
			mav.setViewName("redirect:/main");
		} else {
			//			session.setAttribute("login", login);
			mav.setViewName("redirect:/page_isErrorPage_error");

		}
		return mav;

	}


	/*
	 * 로그인
	 *  1. 다른 패스워드 입력해도 로그인하는 오류 해결 필요
	 * */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String GetwebLogin(HttpSession session, RedirectAttributes rttr) throws Exception {

		logger.info("Login GET Controller >>>>>>>>>");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView PostwebLogin(Model model, ModelAndView modelAndView ,HttpSession session, LogInVO vo, RedirectAttributes rttr) throws Exception{

		logger.info("Login POST Controller >>>>>>>>>");

		String login = webservice.login(vo);
		logger.info(login);

		ModelAndView mav = new ModelAndView();
		if(login == null) {
			mav.setViewName("redirect:/main");
		} else {
			session.setAttribute(login, "login");
			mav.setViewName("/main");

		}
		return mav;

	}


	/*
	회원가입
	 * */
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public ModelAndView GetwebJoin(Model model, Map<Object, String> map) throws Exception {

		logger.info("Join POST Controller >>>>>>>>>");

		return new ModelAndView("join");
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView PostwebJoin(Model model, MemberVO vo, RedirectAttributes rttr) throws Exception {

//		logger.info("Join POST Controller >>>>>>>>>");
		System.out.println("Join post Controller >>>>");

		int rs = webservice.insertJoin(vo);

		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("login");
		} else {
			mav.setViewName("redirect:/join");
		}

		return mav;
	}




	/*
	마이페이지 수정
	 * */
	@RequestMapping(value = "/myModify", method = RequestMethod.GET)
	public ModelAndView GetwebmyModify(Model model, Map<Object, String> map, HttpSession session, MyModifyVO vo) throws Exception {

		// 객체 안에 있는 id정보 저장
		String id = (String)session.getAttribute("userId");

		// 서비스 안의 회원정보 보기 메서드 호출
		//		MemberVO vo1 = webservice.selectLogin(vo);

		// 정보 저장 후 페이지 이동
		model.getAttribute("WebVO");

		return new ModelAndView("myModify");
	}

	@RequestMapping(value = "/myModify", method = RequestMethod.POST)
	public void PostwebmyModify(@RequestParam Map<Object, String> map, Model model) throws Exception {

		webservice.updateMyModify(map);
		/*int rs = webservice.updateMyModify(map);

		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("redirect:/myModify");
		} else {
			mav.setViewName("redirect:/myModify");
		}
		return mav;*/
	}

	/*
	공지사항
	 * */
	/*@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String GetMain(Model model, Map<Object, String> map) throws Exception {

		logger.info("main GET Controller >>>>>>>>>");
		return "/main";
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String PostMain(Model model, MemberVO vo, RedirectAttributes rttr) throws Exception {

		logger.info("main POST Controller >>>>>>>>>");
		return "/main";
	}
*/

	/*
	자유 게시판
 	* */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String GetList(Model model, Map<Object, String> map) throws Exception {

		logger.info("list GET Controller >>>>>>>>>");
		return "list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String PostList(Model model, MemberVO vo, RedirectAttributes rttr) throws Exception {

		logger.info("list POST Controller >>>>>>>>>");
		return "list";
	}

}
