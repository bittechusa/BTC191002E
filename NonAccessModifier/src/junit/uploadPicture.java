package junit;

import org.junit.Assert;
import org.junit.Test;

public class uploadPicture extends baseTest{
	@Test
	public void test2() {
		boolean b=driver.getTitle().contains("Facebook");
		Assert.assertTrue(b);
		Assert.assertFalse(b);
		Assert.assertEquals("ask", "ask");
	}

}
