import static org.junit.Assert.*;

import org.junit.Test;


public class FunctionalArrayListTest {

	@Test
	public void testGettingArrayListHead() {
		FunctionalArrayList myArrayList = new FunctionalArrayList();
		myArrayList.add("Test1");
		myArrayList.add("Test2");
		myArrayList.add("Test3");
		
		assertNotEquals(null, myArrayList.head().getReturnValue());
	}
	
	@Test
	public void testGettingArrayListBody() {
		FunctionalArrayList myArrayList = new FunctionalArrayList();
		myArrayList.add("Test1");
		myArrayList.add("Test2");
		myArrayList.add("Test3");
		assertEquals(2, myArrayList.rest().size());
		
	}

}
