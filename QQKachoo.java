import java.util.Iterator;

public class QQKachoo<T> implements Deque<T>, Iterable<T>{

    private DLLNode<T> _front, _end;
    private int _size;
    
    public QQKachoo(){
		_front = _end = null;
		_size = 0;
    }
    
    //add element to the front of collection
    public void enqueueFront(T x){
    	_front = new DLLNode<T>(x,null,_front);
    	if(isEmpty())
    		_end = _front;
    	else
    		_front.getNext().setPrev(_front);
    	_size++;
    }

    //add element to the end of the collection
    public void enqueueEnd(T x){
    	_end = new DLLNode<T>(x,_end,null);
    	if(isEmpty())
    		_front = _end;
    	else
    		_end.getPrev().setNext(_end);
    	_size++;
    }

    //returns element at front without dequeFront
    public T peekFront(){
		return _front.getCargo();
    }

    //returns element at end without dequeEnd
    public T peekEnd(){
		return _end.getCargo();
    }

    //removes element at front of deque
    //returns removed element
    public T dequeueFront(){
    	T temp = _front.getCargo();
    	_front = _front.getNext();
    	_size--;
    	return temp;
    }

    //removes element at end of deque
    //returns removed element
    public T dequeueEnd(){
    	T temp = _end.getCargo();
    	_end = _end.getPrev();
    	_size--;
    	return temp;
    }
    //returns true if deque is empty, false otherwise
    public boolean isEmpty(){
	return _size == 0;
    }

    //returns an iterator to allow for-each loop from front to end
    public Iterator<T> iterator(){
    	return new FrontIterator<T>(_front);
    }

    //returns an iterator to allow for-each loop from end to front
    public Iterator<T> Diterator(){
    	return new EndIterator<T>(_end);
    }

    public String toString(){
    	String str = "FRONT-->";
    	DLLNode<T> alias = _front;
    	for(int i=0;i<_size;i++){
    		str += alias.getCargo() + "-->";
    		alias = alias.getNext();
    	}
    	str += "-->END";
    	return str;
    }

}
