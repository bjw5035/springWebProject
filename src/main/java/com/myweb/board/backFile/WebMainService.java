package com.myweb.board.backFile;

import java.util.Map;

public interface WebMainService {


//	public List<String> login(Map<String, Object> map) throws Exception;
	public String login(MemberVO memberVO) throws Exception;
	public String join(Map<String, Object> map) throws Exception;

	public String boardInsert(Map<String, Object> map) throws Exception;
}
