package Pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontacTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");

		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);

		System.out.println(PASSWORD);
		System.out.println("executed createcontactTest");

	}
	@Test
	public void modifycontact() {
		System.out.println("execute modifycontactTest");
	}

}
