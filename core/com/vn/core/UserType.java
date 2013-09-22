package com.vn.core;

public enum UserType {

	Administartor("Administartor"),
	Customer("Customer");
		
	private String userType;

    private UserType(String _userType) {
            this.userType = _userType;
    }
    
    public String get() {
    	return this.userType;
    }
}
