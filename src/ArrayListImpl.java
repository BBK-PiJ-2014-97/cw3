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
		
		if(index < 0 || index >= this.arrayData.length) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			/*
			 * We know that there HAS to be something at this index
			 * therefore we don't do many checks beyond the above
			 */
			newDataObject.setObject(this.arrayData[index]);
		}
		
		return newDataObject;
	}

	public ReturnObject remove(int index) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();
		
		if(index < 0 || index >= this.arrayData.length) {
			newDataObject.errorSet = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		} else {
			/*
			 * We can just set the value to null, and run a 
			 * cleanup to make sure we don't have any null values
			 */
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
				/* 
				 * If we have object already at this index, move
				 * existing objects to right, otherwise we can just append
				 */
				if(this.arrayData[index].equals(new ReturnObjectImpl().getReturnValue())) { // We have an entry here
					Object[] tempArray = new Object[this.arrayData.length + 1];
					// If we have object at this position, we need to update indeces after index parameters
					for(int i = 0; i < this.arrayData.length; i++) {
						if(i != index) {
							tempArray[i] = this.arrayData[i];
						} else {
							tempArray[i + 1] = this.arrayData[i]; // Shift everything to right by 1 index
						}
					}
					// At this point tempArray[index] will be null
					tempArray[index] = newDataObject;
				} else { // Just append to end of array
					this.add(item);
				}
			
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
			
			// Overwrite existing array
			this.arrayData = tempArray;
			
			newDataObject.setObject(item);
			arrayData[this.arrayData.length - 1] = newDataObject;
			this.cleanupArray();
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
