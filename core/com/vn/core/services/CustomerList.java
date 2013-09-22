package com.vn.core.services;

import java.util.HashMap;

import com.vn.core.AppUtil;
import com.vn.core.UserBean;

/**
 * @author viraj patil
 *
 */
public class CustomerList {
	private HashMap<String, UserBean> userList;
	private static volatile CustomerList instance;
	
	private CustomerList() {
	   this.userList = new HashMap<>();
	}
	
	public static CustomerList getInstance(){
		if(null == instance ) {
			synchronized (CustomerList.class) {
				if(null == instance)
					instance = new CustomerList();	
			}
		}
		return instance;
	}

	public HashMap<String, UserBean> getUserList() {
		return userList;
	}
	
	public boolean addUser(UserBean user) {
		if (user == null || userList.containsKey(user.getEmailId())) {
			return false;
		}
		userList.put(user.getEmailId(), user);
		return true;
	}
	
	public UserBean getUserByEmailId(String emailId) {
		UserBean user = null;
	   if(!AppUtil.isEmpty(emailId) && userList.containsKey(emailId)) {
		   user = userList.get(emailId);
		   return user;
	   }
	   return user;
	}
	
	public boolean deleteUser(String emailId) {
		if (!AppUtil.isEmpty(emailId) || userList.containsKey(emailId)) {
			userList.remove(emailId);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		CustomerList list=new CustomerList();
	}
}
