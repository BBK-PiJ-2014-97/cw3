/**
 * 
 * @author mario
 *
 */

public class SampleableListImpl extends LinkedListImpl implements SampleableList{

	public SampleableList sample() {
		SampleableListImpl mySList = new SampleableListImpl();
		if(this.childCount <= 0) {
			return mySList;
		} else {
			
			boolean skipNext = true;
			ReturnObjectImpl currentObject = this.child;
			
			/*
			 * This method will return all odd elements of our list
			 * regardless of it's size
			 */
			
			for(int i = 0; i < this.childCount; i++) {
				if(skipNext) {
					skipNext = false;
					continue;
				} else {
					skipNext = true;
				
					mySList.add(currentObject);
					currentObject = currentObject.child;
				}
			}
			
			return mySList;
		}
	}


}
