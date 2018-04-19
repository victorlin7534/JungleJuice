import java.util.Iterator;

public class EndIterator<T> implements Iterator<T>{
	private DLLNode<T> alias;
	private boolean _okToRemove;

	public EndIterator(DLLNode x){
		alias = new DLLNode(null,x,null);
		_okToRemove = false;
	}

	public boolean hasNext(){
		return alias.getPrev() != null;
	}

	public T next(){
		alias = alias.getPrev();
		_okToRemove = true;
		return alias.getCargo();
	}

	public void remove(){
		
	}
}