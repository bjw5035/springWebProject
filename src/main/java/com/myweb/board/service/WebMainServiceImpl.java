package com.myweb.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.board.dao.WebMainDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class WebMainServiceImpl implements WebMainService {

	@Autowired
	WebMainDao dao;

	private static final Logger logger = LoggerFactory.getLogger(WebMainServiceImpl.class);


	@Override
	public List<String> login(Map<String, Object> map) throws Exception {

		logger.info("login >> + ", map);

		List<String> login1 = new ArrayList<>();
		logger.info("login1 ========> " + login1);
//		login1.addAll();

		//		return dao.login(map);
		return login(map);
	}


	@Override
	public String join(Map<String, Object> map) throws Exception {

		logger.info("ServiceImpl >>>> " + map);

		return dao.join(map);
	}

}
