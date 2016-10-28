package com.igatepatni.service;

import com.igatepatni.bean.AccountBean;
import com.igatepatni.bean.UserBean;
import com.igatepatni.dao.BankingDAO;

public class BankingService {

	BankingDAO bankDao;
	
	public BankingService(){
		
		bankDao=new BankingDAO();
	}
	
	public AccountBean userExists(UserBean user) {
		// TODO Auto-generated method stub
		
		return bankDao.userExists(user);
	
	}

	public boolean openAccount(UserBean user, AccountBean account) {
		// TODO Auto-generated method stub
		
		boolean status=bankDao.openAccount(user,account);
		
		return status;
	}

}
