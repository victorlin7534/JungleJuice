import java.util.Iterator;

public class FrontIterator<T> implements Iterator<T>{
	private DLLNode<T> alias;
	private boolean _okToRemove;

	public FrontIterator(DLLNode x){
		alias = new DLLNode(null,null,x);
		_okToRemove = false;
	}

	public boolean hasNext(){
		return alias.getNext() != null;
	}

	public T next(){
		alias = alias.getNext();
		_okToRemove = true;
		return alias.getCargo();
	}

	public void remove(){
		
	}

}

