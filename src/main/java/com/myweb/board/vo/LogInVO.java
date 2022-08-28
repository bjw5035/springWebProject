package com.myweb.board.vo;

import org.springframework.stereotype.Repository;


/*
설명 : 로그인 VO
* */
@Repository
public class LogInVO {

    private String id;
    private String pw;

    public LogInVO() {

    }

    public String getUserId() {
        return id;
    }

    public void setUserId(String userId) {
        this.id = userId;
    }

    public String getUserPw() {
        return pw;
    }

    public void setUserPw(String userPw) {
        this.pw = userPw;
    }

    @Override
    public String toString() {
        return "LogInVO{" +
                "userId='" + id + '\'' +
                ", userPw='" + pw + '\'' +
                '}';
    }

    public LogInVO(String userId, String userPw) {
        super();
        this.id = userId;
        this.pw = userPw;
    }

}
