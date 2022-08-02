package com.myweb.board.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

@Repository
public class WebDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	private static final Logger logger = LoggerFactory.getLogger(WebDao.class);
	
	/* 회원가입 */
	public int insertJoin(MemberVO vo) {

		System.out.println("Dao Join >>>>>>>>>>>>>>>>>>>>>>");
		return sqlSessionTemplate.insert("web.insert_joinmember", vo);
	}
/*
	*//* 로그인 *//*
	public String home(LogInVO vo) throws Exception{

		logger.info("Dao login >>>>>>>>>>>>>>>>>>>>>>");
		return sqlSessionTemplate.selectOne("web.login", vo);
	}
	*/
	/* 로그인 */
	public String login(LogInVO vo) throws Exception{

		logger.info("Dao login >>>>>>>>>>>>>>>>>>>>>>");
		return sqlSessionTemplate.selectOne("web.login", vo);
	}

	
	/* 마이페이지 수정 */

	public void updateMyModify(Map<Object, String> map) {
		
		System.out.println("Dao Modify >>>>>>>>>>>>>>>>>>>>>>");
		sqlSessionTemplate.update("web.update_myModify", map);
	}
	
	/*public List<Object> selectJoin(Map<Object, String> map) {
		
		return sqlSessionTemplate.selectList("web.select_joinmember");
	}*/

}
