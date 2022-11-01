package com.todo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.todo.vo.TodoDTO;

@Mapper
public interface TodoMapper {
	List<TodoDTO> allList();// 모든 할일 목록

	List<TodoDTO> findById(String id) throws Exception; // 사용자 id로 검색

	TodoDTO findByNum(String num) throws Exception; // 번호로 검색

	List<TodoDTO> findByContent(String content) throws Exception; // 내용으로 검색

//	List<TodoDTO> findByDate(Map<String, String> param) throws Exception;// 날짜로 검색

	void add(TodoDTO todo) throws Exception;// 할일 등록

	void modify(TodoDTO todo) throws Exception;// 할일 내용 수정

	void delete(String num) throws Exception;// 삭제 기준(번호)으로 할일 삭제

	void complete(String num) throws Exception;// 번호기준 완료 여부 변경 (N->Y)

	void deleteAll() throws Exception; // 모든 내용 삭제
}