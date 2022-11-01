package com.todo.vo;

import lombok.Data;

@Data
public class TodoDTO {
	private String num;
	private String content;
	private String id;
	private String sdate;
	private String edate;
	private String done;
}
