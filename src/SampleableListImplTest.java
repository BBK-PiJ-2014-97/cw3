import static org.junit.Assert.*;

import org.junit.Test;


public class SampleableListImplTest {

	@Test
	public void testReturnsCorrectSample() {
		SampleableListImpl mySampleList = new SampleableListImpl();
		mySampleList.add("Test1"); // Skip
		mySampleList.add("Test2"); // Add
		mySampleList.add("Test3"); // Skip
		assertEquals(1, mySampleList.sample().size());
	}
	
	@Test
	public void testReturnsEmptyList() {
		SampleableListImpl mySampleList = new SampleableListImpl();
		mySampleList.add("Test1"); // Skip
		assertEquals(0, mySampleList.sample().size());
	}
	
	@Test
	public void testReturnsEmptyListData() {
		SampleableListImpl mySampleList = new SampleableListImpl();
		assertEquals(0, mySampleList.sample().size());
	}

}
