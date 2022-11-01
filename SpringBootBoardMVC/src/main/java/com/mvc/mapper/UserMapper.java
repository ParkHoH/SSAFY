package com.mvc.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mvc.vo.User;

//Service를 위한 인터페이스
@Mapper
public interface UserMapper {
	public boolean check(User u);


}
