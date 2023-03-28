package com.myweb.board.service;

import java.util.List;
import java.util.Map;

public interface WebMainService {


	public List<String> login(Map<String, Object> map) throws Exception;

//	int join(Map<String, Object> map) throws Exception;
	public String join(Map<String, Object> map) throws Exception;
//	public int join(Map<String, Object> map) throws Exception;
}
