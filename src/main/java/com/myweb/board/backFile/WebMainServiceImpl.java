package com.myweb.board.backFile;

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

	@Override
	public String boardInsert(Map<String, Object> map) throws Exception {

		return dao.boardInsert(map);
	}

}
