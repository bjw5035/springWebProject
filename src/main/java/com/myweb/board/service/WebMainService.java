package com.myweb.board.service;

import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

public interface WebMainService {


	LogInVO login(LogInVO vo) throws Exception;
//public Map<String, Object> login(Map<String, Object> map) throws Exception;
	public int join(MemberVO vo1) throws Exception;
}
