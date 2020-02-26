package drink.cg.service;

import java.util.List;

import drink.cg.dao.EmployeeDao;
import drink.cg.dao.EmployeeDaoMapImpl;
import drink.cg.ui.Employee;



public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao employeeDao;
	public EmployeeServiceImpl()
	{
		employeeDao = new EmployeeDaoMapImpl();
	}

	@Override
	public boolean  validateEmployeeName(String username)throws EmployeeException {
	//boolean flag=false;
	  boolean	flag=username.matches("[a-zA-Z0-9]+");
	  if(flag==false || username==null)
	  {
	  throw new EmployeeException("Invalid Entry");
	  }
		return flag;
	}

	@Override  
	public boolean validatePassWord(String passWord) throws EmployeeException {
	//boolean flag=false;
		//System.out.println(passWord);
	boolean	flag=passWord.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//[a-zA-Z0-9].*[@#!].{8,15}");
		if(flag==false || passWord==null)
		{
			 throw new EmployeeException("Invalid Entry");
		}
		return flag;
	}

	@Override
	public boolean validateEMail(String eMail) throws EmployeeException {
		//boolean flag=false;
		boolean flag=eMail.matches("^([1-zA-Z0-1@.\\s]{1,255})$");//"[a-zA-Z0-9]+(_a-zA-Z0-9+)*@[A-Za-z0-9+)*(.[A-Za-z])");
		if(flag==false)
		{
			 throw new EmployeeException("Invalid Entry");
		}
		return flag;
	}

	@Override
	public boolean validatePhoneNumber(String phoneNumber)throws EmployeeException  {
	boolean	flag=false;
	flag=phoneNumber.matches("[7-9]{10}+");
	if(flag==false)
	{
		 throw new EmployeeException("Invalid Entry");
	}
	
		return flag;
	}

	@Override
	public void register(Employee emp) throws EmployeeException 
	{
		String userName=emp.getUserName();
		boolean flag1=validateEmployeeName(userName);
		
		
		if(!flag1)
		{
			throw new EmployeeException("User name should contain alphabets and numbers");
		}
		
		
		String passWord=emp.getPassWord();
		
		boolean flag2=validatePassWord(passWord);
		if(!flag2)
		{
			throw new EmployeeException("password should contain atleast one uppercase character, lowercase character, one digit, and one special character");
		}
		String phoneNumber=emp.getPhoneNum();
		boolean flag3=validatePhoneNumber(phoneNumber);
		if(!flag3)
		{
			throw new EmployeeException("Phone number should contain 10 digits");
		}
		String emailId=emp.getEmail();
		boolean flag4=validateEMail(emailId);
		if(!flag4)
		{
			throw new EmployeeException("email id should be in correct format");
		}
		EmployeeDao.register(emp);
	}

	@Override
	public boolean  login(String str1, String str2) throws EmployeeException 
	{ 
	
		boolean flag1=validateEmployeeName(str1);
		boolean flag2=validatePassWord(str2);
		if(!flag2 || !flag1)
		{
			throw new EmployeeException("password should contain atleast one uppercase character, lowercase character, one digit, and one special character");
		}
	
	
		return employeeDao.equals(login(str1,str2));
	}

	@Override
	public boolean logout(String str) throws EmployeeException 
	{
		boolean flag1=validateEmployeeName(str);
		if(!flag1)
		{
			throw new EmployeeException("User name should contain alphabets and numbers");
		}
		

		
			return employeeDao.logout(str);
		
	}

	@Override
	public List<Employee> ViewAllEmployee() {
		
		
		return EmployeeDao.ViewAllEmployee();
	}

	
	

	@Override
	public String forgotPassword(String str) throws EmployeeException {
		
		String pass="Pass";
		return pass;
	}
	

}
