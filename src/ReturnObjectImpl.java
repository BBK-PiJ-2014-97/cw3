public class ReturnObjectImpl implements ReturnObject {
	private Object myObject;
	public ReturnObjectImpl child = null; // For linked lists
	public ErrorMessage errorSet = ErrorMessage.NO_ERROR;
	
	public void setObject(Object newObject) {
		this.myObject = newObject;
	}
	
	public Object getObject() {
		return this.myObject;
	}
	
	public boolean hasError() {
		return (this.errorSet != ErrorMessage.NO_ERROR);
	}

	public ErrorMessage getError() {
		if(!this.hasError()) {
			return ErrorMessage.NO_ERROR;
		} else {
			return this.errorSet;
		}
	}

	public Object getReturnValue() {
		if(this.hasError()) {
			return null;
		} else {
			return this.myObject;
		}
	}

}
