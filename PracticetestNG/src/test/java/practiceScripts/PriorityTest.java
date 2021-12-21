package practiceScripts;

import org.testng.annotations.Test;

public class PriorityTest {
	
	public class CustomerTest {
		   
		@Test (priority=1)
		public void createCustomer() {
			System.out.println("customer is created");
	    }
		@Test (priority=2) 
	    public void modifyCustomer() {
	    	System.out.println("customer is created and modified");
		}
	    @Test (priority=3) 
	    public void deleteCustomer() {
	    	System.out.println("customer is deleted");
	    }
	    
	}


}
