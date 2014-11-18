/**
 * 
 * @author mario
 *
 */

public class FunctionalArrayList extends ArrayListImpl implements FunctionalList{

	// Return first element in our array list
	public ReturnObject head() {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();
		if(this.arrayData.length == 0) {
			newDataObject.errorSet = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			newDataObject.setObject(this.arrayData[0]);
		}
		return newDataObject;
	}

	// Return everything except first element in our array list
	public FunctionalList rest() {
		FunctionalArrayList myList = new FunctionalArrayList();
		for(int i = 1; i < this.arrayData.length; i++) { // Start at 1
			myList.add(this.get(i));
		}
		
		return myList;
	}

}
