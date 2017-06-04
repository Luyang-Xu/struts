package com.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.service.UserService;
import com.vo.User;

public class LoginAction {

	String username;
	String password;
	UserService service = new UserService();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		String info = this.username + "," + this.password;
		System.out.println(info);
		return "success";
	}

	public String loginJudge() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", this.username);
		map.put("password", this.password);
		User u = service.login(map);
		ActionContext.getContext().getSession().put("username", username);
		ActionContext.getContext().getApplication().put("password", password);
		if (u != null) {
			return "success";
		} else {
			return "fail";
		}

	}
}
