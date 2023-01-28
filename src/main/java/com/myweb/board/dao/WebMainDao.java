package com.myweb.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

@Repository
public class WebMainDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	private static final Logger logger = LoggerFactory.getLogger(WebMainDao.class);


	/* 
	 * 로그인 
	 * */
	public LogInVO login(LogInVO vo) throws Exception {


//		return sqlSessionTemplate.selectList("web.login", vo);
		return sqlSessionTemplate.selectOne("web.login", vo);
	}
	
	/* 
	 * 회원가입 
	 * 
	 * */
	public void join(MemberVO vo1) throws Exception {
		
		System.out.println("dao ===> {}" + vo1);
		
		return;
		
	}
}



