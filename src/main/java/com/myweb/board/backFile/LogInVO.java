package com.myweb.board.backFile;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "LogInVO{" +
                "Id='" + id + '\'' +
                ", Pw='" + pw + '\'' +
                '}';
    }

    public LogInVO(String id, String pw) {
        super();
        this.id = id;
        this.pw = pw;
    }

}
