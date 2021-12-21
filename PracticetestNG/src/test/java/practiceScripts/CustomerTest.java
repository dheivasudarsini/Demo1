package practiceScripts;

import org.testng.annotations.Test;

public class CustomerTest {
   
	@Test
	public void createCustomer() {
		System.out.println("customer is created");
    }
	@Test 
    public void modifyCustomer() {
    	System.out.println("customer is created and modified");
	}
    @Test  
    public void deleteCustomer() {
    	System.out.println("customer is deleted");
    }
    
}
