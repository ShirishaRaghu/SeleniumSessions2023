package testngsessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@BeforeTest()
	public void payment() {
		System.out.println("paymentTest");
	}
	

	
	
	@Test(invocationCount = 10, priority = 2)
	public void createUser() {
		System.out.println("createUserTest");
	}
	
	@Test(priority = 1)
	public void paymentTest() {
		System.out.println("paymentTest");
	}
	
	@AfterTest()
	public void Test() {
		System.out.println("paymentTest");
	}
	

	
	
	
	//AAA(Act Action Assert) pattern - UTs
	
	
	
}
