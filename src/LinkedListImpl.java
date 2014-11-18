/**
 * 
 * @author mario
 *
 * ReturnObjectImpl.child = ReturnObjectImpl
 */

public class LinkedListImpl implements List{
	public ReturnObjectImpl child = null;
	public int childCount;
	
	public boolean isEmpty() {
		return (this.child == null); 
	}

	public int size() {
		return this.childCount;
	}

	public ReturnObject get(int index) {
		// We need to loop through each element
		// i number of times then return whatever .child we have access
		// to at this position in the loop
		
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();	
		
		if(index < 0 || index >= this.childCount) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			ReturnObjectImpl currentObject = this.child;
			for(int i = 1; i < index; i++) {
				currentObject = currentObject.child;
			}
			
			newDataObject.setObject(currentObject.child);
		}
		
		return newDataObject;
	
	}

	public ReturnObject remove(int index) {
		// Before: o1.child = o2.child = o3.child
		// After: o1.child = o3.child (becomes o1.child = o2.child ie o2.child.child)
		
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();
		
		if(index < 0 || index >= this.childCount) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			ReturnObjectImpl currentObject = this.child;
			for(int i = 1; i < index; i++) {
				currentObject = currentObject.child;
			}
			
			// Once we reach the index, we set the child of index as index + 1
			// so its removed by garbage collector
			
			newDataObject.setObject(currentObject.child);
			currentObject.child = currentObject.child.child;
		}
		
		this.childCount--;
		return newDataObject;
	}

	public ReturnObject add(int index, Object item) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();
		
		if(index < 0 || index >= this.childCount) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			ReturnObjectImpl currentObject = this.child;
			for(int i = 1; i < index; i++) {
				currentObject = currentObject.child;
			}
		
			newDataObject.child = currentObject.child;
			currentObject.child = newDataObject;
		}
		
		this.childCount++;
		return newDataObject;
	}

	public ReturnObject add(Object item) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();		
		if(item == null) {
			newDataObject.errorSet = ErrorMessage.INVALID_ARGUMENT;
		} else {
			newDataObject.setObject(item);
			if(this.child == null) {
				this.child = newDataObject;
			}
			
			ReturnObjectImpl currentObject = this.child;
			
			// Loop thru each ReturnObjectImpl.child until we reach end
//			while(currentObject.child != null) {
//				currentObject = currentObject.child;
//				System.out.println("Looped");
//			}
			for(int i = 1; i < this.childCount; i++) {
				currentObject = currentObject.child;
			}
			// Now we've reached end, we set the value
			currentObject.child = newDataObject;
			this.childCount++;
		}
		return newDataObject;
	}
	
}