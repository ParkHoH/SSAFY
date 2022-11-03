package com.todo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.mapper.TodoMapper;
import com.todo.vo.TodoDTO;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoMapper tm;

	@Override
	public List<TodoDTO> allList() throws Exception {
		System.out.println(tm == null);
		return tm.allList();
	}

	@Override
	public List<TodoDTO> find(Map<String, String> param) throws Exception {
		List<TodoDTO> result = new ArrayList<>();
		if (param.containsKey("num")) {
			// one
			result.add(tm.findByNum(param.get("num")));
		} else {
			// list
			if (param.get("search").equals("id"))
				result.addAll(tm.findById(param.get("word")));
			else if (param.get("search").equals("content"))
				result.addAll(tm.findByContent(param.get("word")));
		}
		return result;
	}

	@Override
	@Transactional
	public boolean add(TodoDTO todo) throws Exception {
		tm.add(todo);
		return true;
	}

	@Override
	@Transactional
	public boolean modify(TodoDTO todo) throws Exception {
		tm.modify(todo);
		return true;
	}

	@Override
	@Transactional
	public boolean delete(String num) throws Exception {
		if ((num != null && !num.equals("")))
			tm.delete(num);
		else
			tm.deleteAll();
		return true;
	}

	@Override
	@Transactional
	public boolean complete(String num) throws Exception {
		tm.complete(num);
		return true;
	}

	@Override
	@Transactional
	public boolean deleteAll() throws Exception {
		tm.deleteAll();
		return true;
	}

	@Override
	public TodoDTO findByNum(String num) throws Exception {
		return tm.findByNum(num);
	}

}
