package com.igatepatni.actions;


import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

import com.igatepatni.bean.AccountBean;
import com.igatepatni.bean.UserBean;
import com.igatepatni.service.BankingService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<Object>,ApplicationAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserBean user;
	private AccountBean account;
	private Map application;
	
	public LoginAction() {
		
		user=new UserBean();
	}
	
	public UserBean getUser() {
		return user;
	}
	
	public void setUser(UserBean user) {
		this.user = user;
	}
	
	public BankingService getBankingService(){
		
		return new BankingService();
		
	}

	public String execute(){
		
		BankingService bService=(BankingService) application.get("obj");
		
		setAccount(bService.userExists(user));
		
		if(getAccount()==null){
			addFieldError("userName",getText("login.invalid"));
			
			return INPUT;
		}
		else
			return SUCCESS;
		
	}

	public Object getModel() {
		return user;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
		this.application=application;
	}

	public void setAccount(AccountBean account) {
		this.account = account;
	}

	public AccountBean getAccount() {
		return account;
	}

	
}
