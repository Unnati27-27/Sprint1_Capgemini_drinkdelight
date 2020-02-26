package drink.cg.ui;

public class Employee {
private String userName;
private String passWord;
private String email;
private String phoneNum;
private boolean status;
private String designation,gender;
public Employee(String userName, String passWord, String email, String phoneNum,String designation,String gender) {
	super();
	this.userName = userName;
	this.passWord = passWord;
	this.email = email;
	this.phoneNum = phoneNum;
	this.setDesignation(designation);
	this.setGender(gender);
	
}
public Employee() 
{
	super();
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}

