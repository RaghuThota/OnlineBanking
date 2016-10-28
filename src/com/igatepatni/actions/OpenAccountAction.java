package com.igatepatni.actions;

import java.io.File;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.igatepatni.bean.AccountBean;
import com.igatepatni.bean.UserBean;
import com.igatepatni.service.BankingService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OpenAccountAction extends ActionSupport implements ModelDriven<Object>,ParameterAware,ApplicationAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AccountBean account;
	private UserBean user;
	private Map application;
	private String userName;
	private String password;
	private String rePassword;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public OpenAccountAction(){
		
		account=new AccountBean();
		user=new UserBean();
	}
	
	public void setRePassword(String rePassword){
		this.rePassword=rePassword;
	}
	
	public String getRePassword(){
		return rePassword;
	}
	
	public void setAccount(AccountBean account) {
		this.account = account;
	}

	public AccountBean getAccount() {
		return account;
	}
	
	public String execute(){
		
		try {
            File fileToCreate = new File("c:\\images\\"+account.getAddressUploadFileName());
 
            FileUtils.copyFile(account.getAddressUpload(), fileToCreate);
                        
            
        } catch (Exception e) {
        	
            addFieldError("addressUpload", "Upload Your Address Proof Image");
 
            return INPUT;
        }
        
		try {
            File fileToCreate = new File("c:\\images\\"+account.getPhotoUploadFileName());
 
            FileUtils.copyFile(account.getPhotoUpload(), fileToCreate);
                        
            
        } catch (Exception e) {
        	
            addFieldError("photoUpload", "Upload Your Address Proof Image");
 
            return INPUT;
        }
		
		BankingService bService=(BankingService) application.get("obj");
		
		boolean status=bService.openAccount(user,account);
		
		if(!status)
			return INPUT;
		else
			return SUCCESS;
	}
	
	public void validate(){
		
		if(!getPassword().equals(getRePassword()))
			addFieldError("password", getText("password.same"));
		else if(account.getAccountType().equalsIgnoreCase("Select"))
			addFieldError("accountType",getText("accType.required"));
		else if(account.getOccupation().equalsIgnoreCase("Select"))
			addFieldError("occupation",getText("occupation.required"));
	}

	public AccountBean getModel() {
		
		return account;
	}
	
	public BankingService getBankingService(){
		
		return new BankingService();
		
	}

	@Override
	public void setParameters(Map<String, String[]> param) {
		// TODO Auto-generated method stub
		
		user.setUserName(param.get("userName")[0]);
		user.setPassword(param.get("password")[0]);
		setRePassword(param.get("rePassword")[0]);
		setUserName(user.getUserName());
		setPassword(user.getPassword());		
		
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
		this.application=application;
		
	}


}
