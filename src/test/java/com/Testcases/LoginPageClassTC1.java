package com.Testcases;

import org.testng.annotations.Test;

import com.BaseClass.OrangeBaseClass;

import OrangeLoginpage.OrangeLogPageOBJRepo;

public class LoginPageClassTC1 extends OrangeBaseClass {
	
	
	@Test
	public void login() {
		Driver.get(url);
		OrangeLogPageOBJRepo repo = new OrangeLogPageOBJRepo(Driver);
		repo.cred(username, password);
		repo.clkbtn();
	}
	
	
}
