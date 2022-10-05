package com.myweb.board.service;

import com.myweb.board.dao.WebMainDao;
import com.myweb.board.vo.LogInVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceMainImpl implements WebServiceMain {

	@Autowired
	WebMainDao dao;

	private static final Logger logger = LoggerFactory.getLogger(WebServiceMainImpl.class);


	@Override
	public LogInVO login(LogInVO vo) throws Exception {

		logger.info("Login ServiceImpl >>>>>>>>>", vo);

		return dao.login(vo);
	}

}
