package com.ssafit.mvc.model.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Review {
	private int id;
	private String writer;
	private int boardId;
	private String content;
    private LocalDateTime regDate;  // 날짜 정보만 필요하므로 LocalDate 사용
    private LocalDateTime lastModifiedDate;
    
    public Review() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", writer=" + writer + ", boardId=" + boardId + ", content=" + content
				+ ", regDate=" + regDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
    
    
    
}
