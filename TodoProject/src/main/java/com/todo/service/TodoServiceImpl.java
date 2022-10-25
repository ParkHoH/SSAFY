package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.mapper.TodoMapper;
import com.todo.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	TodoMapper todoMapper;

	@Autowired
	public TodoServiceImpl(TodoMapper todoMapper) {
		this.todoMapper = todoMapper;
	}

	@Override
	public List<Todo> allList() {
		return todoMapper.allList();
	}

	@Override
	public Todo findByNum(String num) throws Exception {
		return todoMapper.findByNum(num);
	}
	
	@Override
	public List<Todo> findById(String id) throws Exception {
		return todoMapper.findById(id);
	}

	@Override
	public List<Todo> findByContent(String content) throws Exception {
		return todoMapper.findByContent(content);
	}
	
	@Override
	public boolean add(Todo todo) throws Exception {
		return todoMapper.add(todo);
	}

	@Override
	public boolean modify(Todo todo) throws Exception {
		return todoMapper.modify(todo);
	}

	@Override
	public boolean delete(String num) throws Exception {
		return todoMapper.delete(num);
	}

	@Override
	public boolean complete(String num) throws Exception {
		return todoMapper.complete(num);
	}

	@Override
	public void deleteAll() throws Exception {
		todoMapper.deleteAll();
	}


}
