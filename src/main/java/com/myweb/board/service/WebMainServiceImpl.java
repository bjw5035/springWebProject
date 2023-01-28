package com.myweb.board.service;

import com.myweb.board.dao.WebMainDao;
import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebMainServiceImpl implements WebMainService {

	@Autowired
	WebMainDao dao;

	private static final Logger logger = LoggerFactory.getLogger(WebMainServiceImpl.class);


	@Override
	public LogInVO login(LogInVO vo) throws Exception {

		return dao.login(vo);
	}

	
	@Override
	public void join(MemberVO vo1) throws Exception {
		
		System.out.println("impl ===> " + vo1);

		return;
	}

}
