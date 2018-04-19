public class QQKachoo<T> implements Deque<T>{

    private DLLNode<T> _front, _end;
    private int _size;
    
    public QQKachoo(){
		_front = new DLLNode<T>(null,null,null);
		_end = _front;
		_size = 0;
    }
    
    //add element to the front of collection
    public void enqueueFront(T x){
    	_front = new DLLNode<T>(x,_end,_front);
    	if(isEmpty())
    		_end = _front;
    	_size++;
    }

    //add element to the end of the collection
    public void enqueueEnd(T x){
    	_end = new DLLNode<T>(x,_end,_end);
    	if(isEmpty())
    		_front = _end;
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
/*
    //returns an iterator to allow for-each loop from front to end
    public Iterator<T> iterator(){

    }

    //returns an iterator to allow for-each loop from end to front
    public Iterator<T> Diterator(){

    }*/

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
