package com.myweb.board.service;

import com.myweb.board.vo.LogInVO;
import com.myweb.board.vo.MemberVO;

import java.util.List;
import java.util.Map;

public interface WebMainService {


	public LogInVO login(LogInVO vo) throws Exception;

//	int join(Map<String, Object> map) throws Exception;
	public String join(Map<String, Object> map) throws Exception;
//	public int join(Map<String, Object> map) throws Exception;
}
