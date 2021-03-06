/**
 * 
 * @author mario
 *
 */
public class ImprovedStackImpl implements ImprovedStack{

	private LinkedListImpl internalList = new LinkedListImpl();
	private StackImpl internalStack = new StackImpl(this.internalList);
	
	public ImprovedStackImpl() {

	}
	
	public boolean isEmpty() {
		return this.internalStack.isEmpty();
	}

	public int size() {
		return this.internalStack.size();
	}

	public void push(Object item) {
		this.internalStack.push(item);
	}

	public ReturnObject top() {
		return this.internalStack.top();
	}

	public ReturnObject pop() {
		return this.internalStack.pop();
	}

	public ImprovedStack reverse() {
		ImprovedStackImpl returnStack = new ImprovedStackImpl();
		// Loop list in reverse order, and add to the new stack we created
		for(int i = this.internalStack.internalList.size(); i > 0; i--) {
			returnStack.push(this.internalStack.internalList.get(i));
		}
		return returnStack;
	}

	public void remove(Object object) {
		for(int i = 0; i < this.size(); i++) {
			// Make sure we are the same Object type
			if(this.internalStack.internalList.get(i).getReturnValue().equals(object)) {
				this.internalStack.internalList.remove(i);
			}
		}
	}

}
