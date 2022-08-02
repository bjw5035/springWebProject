package com.myweb.board.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.board.dao.WebDao;
import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

@Service
public class WebServiceImpl implements WebService {

	@Autowired
	WebDao dao;
	
	private static final Logger logger = LoggerFactory.getLogger(WebServiceImpl.class);
	
	/*
	* 회원가입
	* */
	@Override
	public int insertJoin(MemberVO vo) {

		System.out.println("ServiceImpl join>>>>>>>>>>>>>>");
		return dao.insertJoin(vo);
	}
/*
	@Override
	public String home(LogInVO vo) throws Exception{

		logger.info("Login ServiceImpl >>>>>>>>>");
		
		return dao.login(vo);
	}
	*/
	/*
	 * 로그인
	 * */
	@Override
	public String login(LogInVO vo) throws Exception{

		logger.info("Login ServiceImpl >>>>>>>>>");
		
		return dao.login(vo);
	}

	/*
	 * 개인정보 수정
	 * */
	@Override
	public void updateMyModify(Map<Object, String> map) {
		
		System.out.println("ServiceImpl modify>>>>>>>>>>>>>>");
		dao.updateMyModify(map);
	}

	
}
