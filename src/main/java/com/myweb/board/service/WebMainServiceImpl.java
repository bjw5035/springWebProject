package com.myweb.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.board.dao.WebMainDao;

import java.util.List;
import java.util.Map;

@Service
public class WebMainServiceImpl implements WebMainService {

	@Autowired
	WebMainDao dao;

	private static final Logger logger = LoggerFactory.getLogger(WebMainServiceImpl.class);


	@Override
	public List<Object> login(Map<String, Object> map) throws Exception {

		if (map == null) {
			logger.info("impl false >>>> {}", map);
		} else {
			logger.info("impl true >>>> {}", map);
		}
		return dao.login(map);
	}


	@Override
	public String join(Map<String, Object> map) throws Exception {

		logger.info("ServiceImpl >>>> " + map);

		return dao.join(map);
	}

}
