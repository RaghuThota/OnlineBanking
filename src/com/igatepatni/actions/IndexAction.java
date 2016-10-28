package com.igatepatni.actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class IndexAction extends ActionSupport implements ApplicationAware{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map application;
	private LoginAction login=new LoginAction();



	@Override
	public void setApplication(Map application) {
		
		this.application=application;
		
	}
	
	public String execute(){
		
		application.put("obj", login.getBankingService());
	
		return SUCCESS;
	}


}
