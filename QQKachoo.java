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

    }

    //add element to the end of the collection
    public void enqueueEnd(T x){

    }

    //returns element at front without dequeFront
    public T peekFront(){

    }

    //returns element at end without dequeEnd
    public T peekEnd(){

    }

    //removes element at front of deque
    //returns removed element
    public T dequeueFront(){

    }

    //removes element at end of deque
    //returns removed element
    public T dequeueEnd(){

    }

    //returns true if deque is empty, false otherwise
    public boolean isEmpty(){

    }

    //returns an iterator to allow for-each loop from front to end
    public Iterator<T> iterator(){

    }

    //returns an iterator to allow for-each loop from end to front
    public Iterator<T> Diterator(){

    }

}
