package com.myweb.board.service;

import com.myweb.board.vo.LogInVO;

public interface WebServiceMain {


	/*
	 * 로그인
	 * */
	public String login(LogInVO vo) throws Exception;
}
