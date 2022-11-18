package com.myweb.board.vo;

import org.springframework.stereotype.Repository;


/*
설명 : 로그인 VO
* */
@Repository
public class LogInVO {

    private String id;
    private int pw;

    public LogInVO() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "LogInVO{" +
                "Id='" + id + '\'' +
                ", Pw='" + pw + '\'' +
                '}';
    }

    public LogInVO(String id, int pw) {
        super();
        this.id = id;
        this.pw = pw;
    }

}
