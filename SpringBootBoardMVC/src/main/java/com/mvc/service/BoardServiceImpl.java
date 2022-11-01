package com.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.mapper.BoardMapper;
import com.mvc.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{	
	
	@Autowired
	BoardMapper mapper;//interface type
	
	@Override
	public ArrayList<Board> selectAll() {		
//		System.out.println(mapper);
		return mapper.selectAll();
	}

	@Override
	public Board selectOne(String num) {
		mapper.countUp(num); //해당 번호의 글 조회수를 올림
		return mapper.selectOne(num);
	}

	@Override
	public void insert(Board b) {
		mapper.insert(b);
	}

	@Override
	public int delete(String num) {
		
		return mapper.delete(num);
	}

	@Override
	@Transactional
	public void test() {
		mapper.test(); // insert 실행할거임
		mapper.test();
	}

	@Override
	public ArrayList<Board> search(HashMap<String, String> map) {
		return mapper.search(map);
	}

}
