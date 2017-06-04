package com.dao;

import java.util.List;
import java.util.Map;
import com.vo.User;

public interface UserDao {
 public List<User> getAll();
 
 public void save(User user);
 
 public User login(Map<String,String> hashmap);
}
