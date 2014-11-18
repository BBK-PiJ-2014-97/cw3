/**
 * 
 * @author mario
 *
 */
public class StackImpl extends AbstractStack {

	public StackImpl(List list) {
		super(list);
	}

	public boolean isEmpty() {
		return (this.internalList.size() == 0);
	}

	public int size() {
		return this.internalList.size();
	}

	public void push(Object item) {
		this.internalList.add(item);
	}

	public ReturnObject top() {
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		if(this.internalList.size() == 0) {
			myObject.errorSet = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			myObject.setObject(this.internalList.get(0));
		}
		return myObject;
	}

	public ReturnObject pop() {
		ReturnObjectImpl myObject = new ReturnObjectImpl();
		if(this.internalList.size() == 0) {
			myObject.errorSet = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			myObject.setObject(this.internalList.get(0));
			this.internalList.remove(0);
		}
		return myObject;
	}

}
