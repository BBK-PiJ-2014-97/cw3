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
		int size = 0;
		Object[] tempArray = new Object[size];
		// Loop through each item
		for(int i = 0; i < this.arrayData.length; i++) {
			System.out.println(this.arrayData[i]);
			if(this.arrayData[i] != null) {
				size++;
				if(size < this.arrayData.length) {
					// Append to end of array;
					tempArray[tempArray.length - 1] = this.arrayData[i];
				} else {
					System.arraycopy(this.arrayData, 0, tempArray, 0, this.arrayData.length); // Destination array is smaller
				}
			}
		}
		this.arrayData = tempArray;
	}
}
