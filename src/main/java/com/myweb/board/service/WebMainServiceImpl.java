package com.myweb.board.service;

import com.myweb.board.dao.WebMainDao;
import com.myweb.board.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WebMainServiceImpl implements WebMainService {

	@Autowired
	WebMainDao dao;

	private static final Logger logger = LoggerFactory.getLogger(WebMainServiceImpl.class);


	@Override
	public String login(MemberVO memberVO) throws Exception {

		logger.info("Impl memberVO >>> {}", memberVO);

		memberVO.getUserId();

		if (!memberVO.equals(memberVO)) {
			logger.info("false >>> {}", memberVO);
		} else {
			logger.info("true >>> {}", memberVO);
		}
		return dao.login(memberVO);
	}


	@Override
	public String join(Map<String, Object> map) throws Exception {

		logger.info("ServiceImpl >>>> " + map);

		return dao.join(map);
	}

}
