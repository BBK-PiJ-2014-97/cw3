import static org.junit.Assert.*;

import org.junit.Test;


public class ImprovedStackImplTest {

	@Test
	public void testCanReverseStack() {
		ImprovedStackImpl myStack = new ImprovedStackImpl();
		myStack.push("Test1");
//		myStack.push("Test2");
//		myStack.push("Test3");
		
		myStack.reverse();
		
		assertNotEquals(null, myStack.pop());
	}
	
	@Test
	public void testCanRemoveFromStack() {
		ImprovedStackImpl myStack = new ImprovedStackImpl();
		myStack.push(new ReturnObjectImpl().getReturnValue());
		myStack.push(new ReturnObjectImpl().getReturnValue());
		
		myStack.remove(new ReturnObjectImpl().getReturnValue());
		
		assertEquals(0, myStack.size());
	}

}
