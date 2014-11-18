/**
 * 
 * @author mario
 *
 */
public class ArrayListImpl implements List{
	Object[] arrayData = new Object[0];
	
	public boolean isEmpty() {
		return (arrayData.length == 0);
	}

	public int size() {
		return arrayData.length;
	}

	public ReturnObject get(int index) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();	
		
		if(index < 0 || index >= arrayData.length) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			newDataObject.setObject(arrayData[index]);
		}
		
		return newDataObject;
	}

	public ReturnObject remove(int index) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();
		
		if(index < 0 || index >= arrayData.length) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			this.arrayData[index] = null;
			this.cleanupArray();
		}
		return newDataObject;
	}

	public ReturnObject add(int index, Object item) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();	
	
		if(index < 0 || index >= arrayData.length) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			if(item == null) {
				newDataObject.errorSet = ErrorMessage.INVALID_ARGUMENT;
			} else {
				//TODO
			}
		}
		return newDataObject;
	}

	public ReturnObject add(Object item) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();		
		if(item == null) {
			newDataObject.errorSet = ErrorMessage.INVALID_ARGUMENT;
		} else {
			// Create larger version of current array
			Object[] tempArray = new Object[this.arrayData.length + 1];
			// Clone everything
			System.arraycopy(this.arrayData, 0, tempArray, 0, this.arrayData.length);
			
			this.arrayData = tempArray;
			
			newDataObject.setObject(item);
			arrayData[this.arrayData.length - 1] = newDataObject;
		}
		return newDataObject;
	}
	
	// This method will remove all null values from the array
	private void cleanupArray() {
		// Calculating new array size
		int size = 0;
		for(int i = 0; i < this.arrayData.length; i++) {
			if(this.arrayData[i] != null) {
				size++;
			}
		}
		
		// Copy relevant values
		int temp = 0;
		Object[] newArray = new Object[size];
		for(int z = 0; z < this.arrayData.length; z++) {
			if(this.arrayData[z] != null) {
				newArray[temp] = this.arrayData[z];
				temp++;
			}
		}
		
		this.arrayData = newArray;
		
	}
}
