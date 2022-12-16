package com.myweb.board.dao;

import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WebMainDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	private static final Logger logger = LoggerFactory.getLogger(WebMainDao.class);


	/* 로그인 */
	public LogInVO login(LogInVO vo) throws Exception {

		logger.info("Dao login >>>>>>>>>>>>>>>>>>>>>>");

		return sqlSessionTemplate.selectOne("web.login", vo);
	}
	
	/* 회원가입 */
//	public List<String, Object> join(List<String, Object> Map) throws Exception {
	public MemberVO join(MemberVO vo1) throws Exception {
		return vo1;
		
//		return sqlSessionTemplate.insert("web.join", vo1);
		
	}
}



