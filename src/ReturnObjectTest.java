import static org.junit.Assert.*;

import org.junit.Test;


public class ReturnObjectTest {

	// Test creating new object
	@Test
	public void testCreatingNewReturnObject() {
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		assertNotEquals(null, myObject);
	}
	
	// Test set object
	
	@Test
	public void testSettingNewReturnObject() {
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		
		// Written like this for clarity that it's an object
		String myString = new String("Test");
		
		myObject.setObject(myString);
		assertNotEquals(null, myObject.getObject());
	}
	
	// Test has error
	
	@Test
	public void testHasErrorFromReturnObject() {
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		myObject.errorSet = ErrorMessage.EMPTY_STRUCTURE; // Test error
		
		assertEquals(true, myObject.hasError());
	}
	
	// Test get error
	
	@Test
	public void testGetErorFromReturnObject() {
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		assertEquals(ErrorMessage.NO_ERROR, myObject.getError());
	}
	
	// Test get return value
	
	@Test
	public void testGetReturnValueFromReturnObject(){
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		
		// Written like this for clarity that it's an object
		String myString = new String("Test");
		
		myObject.setObject(myString);
		assertNotEquals(null, myObject.getReturnValue());
	}
}
