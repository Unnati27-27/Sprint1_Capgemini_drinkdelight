package drink.cg.ui;





import java.util.List;
import java.util.Scanner;

import drink.cg.service.EmployeeService;
import drink.cg.service.EmployeeServiceImpl;



public class User {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Welcome to Drink and Delight");
		System.out.println("=======================================");
		System.out.println("Select the desired action");
		EmployeeService employeeService=new EmployeeServiceImpl();
		int choice=0;
		Employee emp=null;
		List<Employee> list=null;
		while(true)
		{
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Logout");
			System.out.println("4.ViewAllusers");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice=scr.nextInt();
			switch(choice)
			{
			case 1:
		
				try
				{
		        System.out.print("Enter the employee name");
		        
		        scr.nextLine();
		        String username=scr.nextLine();
		      
		        System.out.print("Enter the password");
		        String password=scr.nextLine();
		        System.out.print("Enter the email id ");
		        String emailid=scr.nextLine();
		        System.out.print("Enter the phonenumber");
		        String phonenumber=scr.nextLine();
		        emp = new Employee();
		        emp.setUserName(username);
		       
		        emp.setPassWord(password);
		        emp.setEmail(emailid);
		        emp.setPhoneNum(phonenumber);
		        employeeService.register(emp);
				}
				catch(Exception e)
				{
				e.printStackTrace();
				}
				break;
			case 2:
				try
				{
					scr.nextLine();
				System.out.println("Please enter your login credential");
				System.out.println("user name:");
				String username1=scr.nextLine();
				System.out.println("password:");
				String password1=scr.nextLine();
			     employeeService.login(username1, password1);
				}
				catch(Exception e)
				{
					System.err.println(e.getMessage());
				}
				break;
				
			case 3:
				try
				{
					scr.nextLine();
					System.out.println("=========================");
				System.out.println("Enter user name to Logout");
				System.out.println("enter the user name");
				String  username1=scr.nextLine();
				employeeService.logout(username1);
				System.out.println("Logged out successfully");
				}
				catch(Exception e)
				{
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Displaying Employee Details");
				try
				{
					list=employeeService.ViewAllEmployee();
					for(Employee u:list)
					{
						System.out.println("=================================");
						System.out.println("Employee name="+u.getUserName());
					}
				}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				break;
		
			case 5:
				System.out.println("Thank you");
		        	return ;
		  
			default:
				System.out.println("Please enter valid input");
				break;
		 
			}
		
	}
		}


}
