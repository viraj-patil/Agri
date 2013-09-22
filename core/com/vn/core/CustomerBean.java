package com.vn.core;

public class CustomerBean extends UserBean {

	private String userType;
	public CustomerBean(String _username, String _password, String _emailId,
			String _phoneNo, String _userType, String _gender) {
		super(_username, _password, _emailId, _phoneNo, _userType, _gender);
		
		userType=UserType.Customer.get();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return userType;
	}

}
