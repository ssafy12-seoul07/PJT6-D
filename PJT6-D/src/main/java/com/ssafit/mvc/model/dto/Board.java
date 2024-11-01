package com.ssafit.mvc.model.dto;

import org.springframework.stereotype.Component;

@Component
public class Board {
    private int id;
    private String title; // 영상 제목
    private String writer; // 영상 제작자
    private String content; // 영상 내용
    private String regDate; // 등록일자
    private int viewCnt; // 조회수
    
    public Board() {}

    public Board(int id, String title, String writer, String content, String regDate, int viewCnt) {
        super();
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.regDate = regDate;
        this.viewCnt = viewCnt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    @Override
    public String toString() {
        return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
                + regDate + ", viewCnt=" + viewCnt + "]";
    }
    
    
}
