package com.myweb.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class WebMainDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	private static final Logger logger = LoggerFactory.getLogger(WebMainDao.class);


	/* 
	 * 로그인 
	 * */
	public List<String> login(Map<String, Object> map) throws Exception {
		logger.info("dao login >>>> {}", map);

		return sqlSessionTemplate.selectList("web.login", map);
	}
	
	/* 
	 * 회원가입
	 * selectOne : 데이터를 한 개만 가져올때 사용한다.
	 * */
	public String join(Map<String, Object> map) throws Exception {
		
		logger.info("dao >>>> " + map);
		
		return sqlSessionTemplate.selectOne("web.join", map);

	}
}



