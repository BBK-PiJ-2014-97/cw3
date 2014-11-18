/**
 * 
 * @author mario
 *
 */
public class ArrayListImpl implements List{
	Object[] arrayData = new Object[1];
	
	/**
	 * This variable is the current index we have for our data arrays
	 * so if we have an array length of 10, but only 3 items,
	 * this index would be 3, not 2
	 */
	
	private int lastIndex = 0;
	
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
			//@todo
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
				//@todo
			}
		}
		return newDataObject;
	}

	public ReturnObject add(Object item) {
		ReturnObjectImpl newDataObject = new ReturnObjectImpl();		
		if(item == null) {
			newDataObject.errorSet = ErrorMessage.INVALID_ARGUMENT;
		} else {
			this.lastIndex++;
			// Create larger version of current array
			Object[] tempArray = new Object[this.lastIndex];
			// Clone everything
			System.arraycopy(this.arrayData, 0, tempArray, 0, this.arrayData.length);
			
			this.arrayData = tempArray;
			
			newDataObject.setObject(item);
			arrayData[this.lastIndex - 1] = newDataObject;
		}
		return newDataObject;
	}
	
}
