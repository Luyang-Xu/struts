package com.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;
import com.vo.User;

public class UserAction implements ModelDriven<User>,RequestAware {
	private User user = new User();
	private Map<String,Object> request;
	UserService service=new UserService();

	public String save() {
		service.save(user);
//		//实现接口的注入方式
//		List<String> list=Arrays.asList(new String[]{"hello","world","happy"});
//		this.request.put("list", list);
//		
//		//上下文方式
//		ActionContext ac=ActionContext.getContext();
//		ac.getSession().put("hobby", Arrays.asList(new String[]{"football","swimming","basketball"}));
		return "save";
	}
	
	public String getAll(){
		List<User> list=service.getAll();
		request.put("list", list);
		return "list";
	}

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;
	}

	
}
