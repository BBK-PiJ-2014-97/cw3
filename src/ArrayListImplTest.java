import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListImplTest {

	@Test
	public void testCreatingNewArrayList() {
		System.out.println("Begin Test: testCreatingNewArrayList");
		ArrayListImpl myArrayList = new ArrayListImpl();
		assertNotEquals(null, myArrayList);
	}

	@Test
	public void testCanAddValueToArrayList() {
		System.out.println("Begin Test: testCanAddValueToArrayList");
		ArrayListImpl myArrayList = new ArrayListImpl(); 
		myArrayList.add("Elmario");
		assertNotEquals(null, myArrayList.get(0));
	}
	
	@Test
	public void testCanGetSizeOfList() {
		System.out.println("Begin Test: testCanGetSizeOfList");

		ArrayListImpl myArrayList = new ArrayListImpl();
		myArrayList.add("Elmario");
		myArrayList.add("Test");
		myArrayList.add(10);
		assertEquals(3, myArrayList.size());	
	}
	
	@Test
	public void testCanGetValueFromSpecificIndex() {
		System.out.println("Begin Test: testCanGetValueFromSpecificIndex");
		
		ArrayListImpl myArrayList = new ArrayListImpl();
		
		myArrayList.add("Elmario");
		assertNotEquals(null, myArrayList.get(0).getReturnValue());
		
		myArrayList.add(4);
		assertNotEquals(null, myArrayList.get(1).getReturnValue());

		myArrayList.add(new Object());
		assertNotEquals(null, myArrayList.get(2).getReturnValue());
		
		myArrayList.add(4.54);
		assertNotEquals(null, myArrayList.get(3).getReturnValue());
	}
	
	@Test
	public void testCanRemoveValueFromSpecificIndex() {
		System.out.println("Begin Test: testCanRemoveValueFromSpecificIndex");
		
		ArrayListImpl myArrayList = new ArrayListImpl();
		
		myArrayList.add("Elmario");
		assertNotEquals(null, myArrayList.get(0).getReturnValue());
		
		myArrayList.add(4);
		assertNotEquals(null, myArrayList.get(1).getReturnValue());
		
		myArrayList.remove(0);
		assertNotEquals(null, myArrayList.get(0).getReturnValue());
	}
	
//	@Test
//	public void testCanAddValueToSpecificIndex() {
//		System.out.println("Begin Test: testCanRemoveValueFromSpecificIndex");
//		
//		ArrayListImpl myArrayList = new ArrayListImpl();
//		
//		myArrayList.add("Elmario");
//		assertNotEquals(null, myArrayList.get(0).getReturnValue());
//		
//		myArrayList.add(1, "Test");
//		assertNotEquals(null, myArrayList.get(1).getReturnValue());	
//	}
	
}
