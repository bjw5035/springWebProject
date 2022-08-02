package com.myweb.board.service;

import java.util.Map;

import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

public interface WebService {
	
	public int insertJoin(MemberVO vo) throws Exception;
	
	public String login(LogInVO vo) throws Exception;
//	public String home(LogInVO vo) throws Exception;
	
	public void updateMyModify(Map<Object, String> map) throws Exception;

}
