package com.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import com.vo.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;


@SuppressWarnings("unused")
public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() throws OgnlException {
		OgnlContext context=new OgnlContext();
		context.put("name", "xuluyang");
		context.put("list", Arrays.asList("list1","list2","list3"));
		User u= new User("xly", "123");
		context.put("user",u);
		context.setRoot(u);
		
		System.out.println(Ognl.getValue("#name", u));
		System.out.println(Ognl.getValue("getPassword()", u));
		System.out.println(Ognl.getValue("#list[0]", context, u));
		System.out.println(Ognl.getValue("getPassword()", context, u));
		System.out.println(Ognl.getValue("#name", context, u));
	}

}
