package yongs.temp.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import yongs.temp.vo.User;

@Mapper
public interface UserMapper {
	public List<User> findAll();
	public User findByEmail(String email);
}