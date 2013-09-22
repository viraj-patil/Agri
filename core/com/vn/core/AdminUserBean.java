package com.vn.core;

public class AdminUserBean extends UserBean{
	
	private String userType;
	
	public AdminUserBean(String _username, String _password, String _emailId,
			String _phoneNo, String _userType, String _gender) {
		super(_username, _password, _emailId, _phoneNo, _userType, _gender);
		this.userType = UserType.Administartor.get();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return userType;
	}

}
