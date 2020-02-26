package drink.cg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import drink.cg.ui.Employee;



public class EmployeeDaoMapImpl implements EmployeeDao
{
	private Map<String, Employee> map;
	Employee emp=null;
	public EmployeeDaoMapImpl()
	{
		map=new HashMap<String, Employee>();
	}
	public void register(Employee emp) throws EmployeeDaoException {

	if(!map.containsKey(emp.getUserName()))
	{
		map.put(emp.getUserName(), emp);
		
	}
	else {
		throw new EmployeeDaoException(" Id already exists");
	}

	}
	@Override
	public boolean login(String str1, String str2) 
	{
		if(map.containsKey(str1))
		{
			Employee emp=map.get(str1);
			if(emp.isStatus()==true)
			{
				System.out.println("You are already logged in");
			}
			if(emp.getPassWord().equals(str2))
			{		
		    emp.setStatus(true);
			}
			return true;
		}
		
		else
		{
			System.out.println(" You have not registerd");
		}
		
			return map.containsKey(str1);
		
     }
	@Override
	public boolean logout(String str) {
	boolean status=false;
		if(!map.containsKey(str))
		{
			System.out.println("You are not logged in");
		}
			Employee emp=map.get(str);
		boolean flag=emp.isStatus();
		  if(flag==true)
		  {
			  status=false;
		  }	
		
		return status;
	}
	public List<Employee> ViewAllUsers() throws EmployeeDaoException {
		Collection<Employee> col=map.values();
		List<Employee> list=new ArrayList<>();
		for(Employee u:col)
		{
			list.add(u);
		}
		return list;
	}
	
}