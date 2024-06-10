package com.myweb.board.backFile;

import org.springframework.stereotype.Repository;

/*
설명 : 개인정보 수정 VO
* */
@Repository
public class MyModifyVO {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;

	public MyModifyVO() {

	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "WebVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ "]";
	}
	public MyModifyVO(String userId, String userPw, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	
}
