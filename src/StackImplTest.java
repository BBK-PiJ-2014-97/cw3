import static org.junit.Assert.*;

import org.junit.Test;


public class StackImplTest {
	
	@Test
	public void testCanPushToStack() {
		// We can use either ArrayList or LinkedList, it won't make a difference
		// ArrayListImpl myList = new ArrayListImpl();
		LinkedListImpl myList = new LinkedListImpl();
		StackImpl myStack = new StackImpl(myList);
		
		String myString = new String("Hello");
		
		myStack.push(myString);
		myStack.push(2);
		
		assertEquals(2, myStack.size());
	}
	
	@Test
	public void testCanGetTopOfStack() {
		LinkedListImpl myList = new LinkedListImpl();
		StackImpl myStack = new StackImpl(myList);
		
		String myString = new String("Hello");
		
		myStack.push(myString);

		assertNotEquals(null, myStack.top());
	}
	
	@Test
	public void testCanPopFromStack() {
		LinkedListImpl myList = new LinkedListImpl();
		StackImpl myStack = new StackImpl(myList);
		
		String myString = new String("Hello");
		
		myStack.push(myString);
		myStack.push(2);
		myStack.push(5);
		
		assertNotEquals(null, myStack.pop()); // Should return object
		assertNotEquals(null, myStack.top().getReturnValue());
	}

}
