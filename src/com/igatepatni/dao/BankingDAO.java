package com.igatepatni.dao;

import java.util.HashMap;

import com.igatepatni.bean.AccountBean;
import com.igatepatni.bean.UserBean;

public class BankingDAO {

	HashMap<UserBean, AccountBean> hashMapDB;
	
	public BankingDAO() {
		// TODO Auto-generated constructor stub
		
		UserBean user=new UserBean();
		user.setUserName("Nagaraju");
		user.setPassword("Manupuri");
		
		AccountBean acc=new AccountBean();
		acc.setFirstName("Nagaraju");
		acc.setAccountNumber(536559);
		acc.setAccountType("Salary");
		acc.setAddress("TallaSingaram");
		acc.setAlternateMobileNumber(559536);
		acc.setAmount(36000);
		acc.setGender("Male");
		acc.setLastName("Manupuri");
		acc.setMobile(888888);
		acc.setOccupation("Software Engineer");
		acc.setOfficeAddress("Bangalore");
		
		hashMapDB=new HashMap<UserBean, AccountBean>();
		
		hashMapDB.put(user, acc);
	}
	
	public AccountBean userExists(UserBean user) {
		// TODO Auto-generated method stub
		
		boolean status=false;
		AccountBean account=null;
		
		status=hashMapDB.containsKey(user);
		
		if(status){
			account=hashMapDB.get(user);
		}
			
		return account;
	}

	public boolean openAccount(UserBean user, AccountBean account) {
		// TODO Auto-generated method stub
		
		hashMapDB.put(user, account);
				
		return true;
	}

}
