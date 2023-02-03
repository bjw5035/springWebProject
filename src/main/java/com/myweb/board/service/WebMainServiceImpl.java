package com.myweb.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.board.dao.WebMainDao;
import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

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
	public String join(MemberVO vo1) throws Exception {
		
		logger.info("ServiceImpl >>>> " + vo1);

		return dao.join(vo1);
	}

}
