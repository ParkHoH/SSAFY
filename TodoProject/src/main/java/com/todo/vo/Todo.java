package com.todo.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Todo {
	private String num;
	private String content;
	private String id;
	private String sdate;
	private String edate;
	private String done;
}
