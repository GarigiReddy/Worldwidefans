package Contact;

import org.testng.annotations.Test;

public class rebelTest {
@Test(groups= {"smokeTest"})
public void smokertest() {
	System.out.println("smokers in the fans club");
}
@Test(groups= {"regressionTest"})
public void decentTest() {
	System.out.println("decent guys in the fans club");
}
}
