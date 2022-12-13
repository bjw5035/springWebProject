package com.myweb.board.service;

import com.myweb.board.vo.LogInVO;

public interface WebMainService {


	LogInVO login(LogInVO vo) throws Exception;
//public Map<String, Object> login(Map<String, Object> map) throws Exception;
}
