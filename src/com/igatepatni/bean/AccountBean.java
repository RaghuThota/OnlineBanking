package com.igatepatni.bean;

import java.io.File;

public class AccountBean {
	
	private long accountNumber;
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String accountType;
	private String occupation;
	private String officeAddress;
	private long mobile;
	private long alternateMobileNumber;
	private long amount;
	private File photoUpload;
	private File addressUpload;
	private String photoUploadContentType;
	private String addressUploadContentType;
	private String photoUploadFileName;
	private String addressUploadFileName;
	
	public File getPhotoUpload() {
		return photoUpload;
	}
	public void setPhotoUpload(File photoUpload) {
		this.photoUpload = photoUpload;
	}
	public File getAddressUpload() {
		return addressUpload;
	}
	public void setAddressUpload(File addressUpload) {
		this.addressUpload = addressUpload;
	}
	public String getPhotoUploadContentType() {
		return photoUploadContentType;
	}
	public void setPhotoUploadContentType(String photoUploadContentType) {
		this.photoUploadContentType = photoUploadContentType;
	}
	public String getAddressUploadContentType() {
		return addressUploadContentType;
	}
	public void setAddressUploadContentType(String addressUploadContentType) {
		this.addressUploadContentType = addressUploadContentType;
	}
	public String getPhotoUploadFileName() {
		return photoUploadFileName;
	}
	public void setPhotoUploadFileName(String photoUploadFileName) {
		this.photoUploadFileName = photoUploadFileName;
	}
	public String getAddressUploadFileName() {
		return addressUploadFileName;
	}
	public void setAddressUploadFileName(String addressUploadFileName) {
		this.addressUploadFileName = addressUploadFileName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(long alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getAmount() {
		return amount;
	}


}
