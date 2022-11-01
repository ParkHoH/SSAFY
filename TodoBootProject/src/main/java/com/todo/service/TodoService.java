package com.todo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.todo.vo.TodoDTO;

public interface TodoService {

	List<TodoDTO> allList() throws Exception;// 모든 할일 목록

	List<TodoDTO> find(Map<String, String> param) throws Exception; // 사용자 id, 날짜로 검색

	TodoDTO findByNum(String num) throws Exception;
	
	boolean add(TodoDTO todo) throws Exception;// 할일 등록

	boolean modify(TodoDTO todo) throws Exception;// 할일 내용 수정

	boolean delete(String num) throws Exception;// 삭제 기준(사용자 id or 번호)으로 할일 삭제

	boolean complete(String num) throws Exception;// 번호기준 완료 여부 변경 (N->Y)

	boolean deleteAll() throws Exception;; // 모든 내용 삭제
}
