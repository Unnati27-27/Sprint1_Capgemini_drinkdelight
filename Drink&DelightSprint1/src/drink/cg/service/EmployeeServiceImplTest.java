package drink.cg.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeServiceImplTest {
	EmployeeServiceImpl e=new EmployeeServiceImpl();
	@Test
	
	
	
	
	
	public void employeeValidatePassword()
	{
		try {
			assertEquals(true,e.validatePassWord("Unnati"));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
