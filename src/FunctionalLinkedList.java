/**
 * 
 * @author mario
 *
 */

public class FunctionalLinkedList extends LinkedListImpl implements FunctionalList{

	// Return first element in our array list
	public ReturnObject head() {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();
		if(this.childCount == 0) {
			newDataObject.errorSet = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			newDataObject.setObject(this.child);
		}
		return newDataObject;
	}

	public FunctionalList rest() {
		FunctionalLinkedList myList = new FunctionalLinkedList();
		ReturnObjectImpl currentObject = this.child.child;
		
		// Loop thru each ReturnObjectImpl.child until we reach end
		for(int i = 1; i < this.childCount; i++) {
			myList.add(currentObject);
			currentObject = currentObject.child;
		}
		
		return myList;
	}

}
