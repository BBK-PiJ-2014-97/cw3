import static org.junit.Assert.*;

import org.junit.Test;


public class FunctionalLinkedListTest {

	@Test
	public void testGettingLinkedListHead() {
		FunctionalLinkedList myLinkedList = new FunctionalLinkedList();
		myLinkedList.add("Test1");
		myLinkedList.add("Test2");
		myLinkedList.add("Test3");
		assertNotEquals(null, myLinkedList.head());
	}
	
	@Test
	public void testGettingLinkedListBody() {
		FunctionalLinkedList myLinkedList = new FunctionalLinkedList();
		myLinkedList.add("Test1");
		myLinkedList.add("Test2");
		myLinkedList.add("Test3");
		assertEquals(2, myLinkedList.rest().size());
		
	}

}
