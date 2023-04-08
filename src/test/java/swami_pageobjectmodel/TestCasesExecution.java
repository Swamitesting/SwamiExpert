package swami_pageobjectmodel;

import org.testng.annotations.Test;

public class TestCasesExecution extends Repository {
	
	
	@Test(priority = 0)
	public static void verifylogin() throws Exception {
		Repository.login1();
		Thread.sleep(3000);
		
	}
	@Test(priority = 1)
	public static void verifyaddtocart() throws Exception {
		Repository.addtocart();
		Thread.sleep(3000);
		
	}
	@Test(priority = 2)
	public static void Verifyproductsname() throws Exception {
		Repository.products();
		Thread.sleep(3000);
		
	}

}
