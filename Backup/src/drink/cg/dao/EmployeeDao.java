package drink.cg.dao;


import java.util.List;

import drink.cg.ui.Employee;




public interface EmployeeDao 
{
      public static void register(Employee emp) {
		// TODO Auto-generated method stub
		
	}
      public boolean login(String str1, String str2) ;
      public boolean logout(String str) ;
   
	public static List<Employee> ViewAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
