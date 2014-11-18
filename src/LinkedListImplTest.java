import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListImplTest {

	@Test
	public void testCreatingNewLinkedList() {
		System.out.println("Begin Test: testCreatingNewLinkedList");
		LinkedListImpl myLinkedList = new LinkedListImpl();
		assertNotEquals(null, myLinkedList);
	}
	
	@Test
	public void testCanAddValueToLinkedList() {
		System.out.println("Begin Test: testCanAddValueToLinkedList");
		LinkedListImpl myLinkedList = new LinkedListImpl(); 
		myLinkedList.add("Elmario");
		
		assertEquals(1, myLinkedList.size());
	}
	
	@Test
	public void testCanGetValueFromLinkedList() {
		System.out.println("Begin Test: testCanGetValueFromLinkedList");
		LinkedListImpl myLinkedList = new LinkedListImpl(); 
		myLinkedList.add("Elmario");
		
		assertNotEquals(null, myLinkedList.get(0).getReturnValue());
	}
	
	@Test
	public void testCanAddValueToSpecificLinkedListIndex() {
		System.out.println("Begin Test: testCanAddValueToSpecificLinkedListIndex");
		LinkedListImpl myLinkedList = new LinkedListImpl(); 
		myLinkedList.add(0, "Elmario");
		myLinkedList.add(1, 5);
		myLinkedList.add(2, 10);
		
		assertEquals(3, myLinkedList.size());
	}
	
	@Test
	public void testCanRemoveValueFromLinkedList() {
		System.out.println("Begin Test: testCanRemoveValueFromLinkedList");
		LinkedListImpl myLinkedList = new LinkedListImpl(); 
		myLinkedList.add("Elmario");
		myLinkedList.remove(0);
		
		assertEquals(0, myLinkedList.size());
	}

}
