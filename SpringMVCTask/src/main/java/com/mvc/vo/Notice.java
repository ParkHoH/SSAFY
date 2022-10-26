package com.mvc.vo;
//board 테이블의 레코드 한 건의 정보를 저장하기 위한 클래스

public class Notice {
	private String num, id, job, title, content, posted_date, cnt;
	
	public Notice() {}

	public Notice(String num, String id, String job, String title, String content, String posted_date, String cnt) {
		this.num = num;
		this.id = id;
		this.job = job;
		this.title = title;
		this.content = content;
		this.posted_date = posted_date;
		this.cnt = cnt;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(String posted_date) {
		this.posted_date = posted_date;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Notice [num=" + num + ", id=" + id + ", job=" + job + ", content=" + content + ", posted_date="
				+ posted_date + ", cnt=" + cnt + "]";
	}
}
