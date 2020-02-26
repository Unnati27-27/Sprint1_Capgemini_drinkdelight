package drink.cg.service;

import java.util.List;

import drink.cg.ui.Employee;
import drink.cg.ui.User;




public interface EmployeeService 
{
      public boolean validateEmployeeName(String userName)throws EmployeeException;
      public boolean validatePassWord(String passWord)throws EmployeeException;
      public boolean validateEMail(String eMail)throws EmployeeException;
      public boolean validatePhoneNumber(String phoneNumber)throws EmployeeException;
    
      public  void register(Employee emp) throws EmployeeException ;
      public boolean login(String str1, String str2)  throws EmployeeException;
      public boolean logout(String str)throws EmployeeException;
      public String forgotPassword(String str) throws EmployeeException;
      public  List<Employee> ViewAllEmployee();
	
      

}

