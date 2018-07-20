package com.nucleus.DAO;

import java.util.List;

import com.nucleus.domain.UserInfo;


public interface CustomerDAO
{
	public void newUser(UserInfo userInfo);
	public List<UserInfo> view(UserInfo userInfo);
	public void delete(UserInfo userInfo);
	
	public List<UserInfo> viewAll();
	public 	UserInfo viewUpdate(String usercode);
	public	 void Update (UserInfo userInfo);
	
	
}
