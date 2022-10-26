package com.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.mvc.vo.Notice;

//Controller를 위한 인터페이스
public interface NoticeService {
	ArrayList<Notice> selectAll(); //모든 레코드 검색
	Notice selectOne(String num);//해당 번호의 레코드 검색
	void insert(Notice n);//새 레코드 추가
//	int delete(String num);
//	void test();
//	ArrayList<Notice> search(HashMap<String, String> map);
}
