package genericlibraries;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericlibraries.listenerImplimentation.class)
public class TestCase extends baseClass {
	@Test
	public void validatePasstest()
	{
		System.out.println("this is from passed testcase");
	}
	@Test
	public void validatefailedtest(){
		System.out.println("this is from failed testcase");
		assertEquals(false, true);
	}
	@Test
	public void validarteSkippedtest()
	{
		System.out.println("this is from skipped testcase");
		throw new SkipException("this is skipped");
		
	}

}
