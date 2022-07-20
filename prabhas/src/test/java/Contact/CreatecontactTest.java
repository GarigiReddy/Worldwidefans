package Contact;

import org.testng.annotations.Test;

public class CreatecontactTest {
@Test(groups= {"regressionTest"})
public void CreateonlyTest() {
	System.out.println("create contact for die hard fans");
}
@Test(groups={"smokeTest"})
public void deleteTest() {
	System.out.println("delete fake numbers");
}
}
