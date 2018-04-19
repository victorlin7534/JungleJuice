public interface Deque<T> {

    //add element to the front of collection
    public void enqueFront(T x);

    //add element to the end of the collection
    public void enqueEnd(T x);

    //returns element at front without dequeFront
    public T peekFront();

    //returns element at end without dequeEnd
    public T peekEnd();

    //removes element at front of deque
    //returns removed element
    public T dequeFront();

    //removes element at end of deque
    //returns removed element
    public T dequeEnd();

    //returns true if deque is empty, false otherwise
    public boolean isEmpty();

    //returns an iterator to allow for-each loop from front to end
    public Iterator<T> iterator();

    //returns an iterator to allow for-each loop from end to front
    public Iterator<T> Diterator();

}
