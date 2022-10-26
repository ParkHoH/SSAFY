package com.mvc.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import com.mvc.vo.Notice;

//Service를 위한 인터페이스
public interface NoticeMapper {
	ArrayList<Notice> selectAll();//모든 레코드 검색
	int countUp(String num);
	Notice selectOne(String num);//해당 번호의 레코드 검색
	void insert(Notice n);//새 레코드 추가
//	int delete(String num);
//	void test();
//	ArrayList<Notice> search(HashMap<String, String> map);
}
