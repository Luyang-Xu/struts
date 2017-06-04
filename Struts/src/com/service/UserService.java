package com.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import com.dao.UserDao;
import com.mybatisFactory.MyBatisFactory;
import com.vo.User;

public class UserService {

	public void save(User user) {
		SqlSession session = MyBatisFactory.getSession();
		UserDao dao = session.getMapper(UserDao.class);
		try {
			dao.save(user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

	}
//得到所有用户
	public List<User> getAll() {
		SqlSession session = MyBatisFactory.getSession();
		UserDao dao = session.getMapper(UserDao.class);
		List<User> list = null;
		try {
			list = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	//单个用户登陆
	public User login(Map<String,String> map){
		SqlSession session = MyBatisFactory.getSession();
		UserDao dao = session.getMapper(UserDao.class);
		User u=null;
		try{
			u=dao.login(map);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return u;
	}
	
	
}
