# JungleJuice
Victor Lin, Johnny Wong, Qian Zhou

Pd1

## TO-DO List
implement:
 1. isEmpty()
 2. peek(Front/End)()
 3. enqueue(Front/End)()
 4. dequeue(Front/End)()
 5. (D)iterator()

## Dev Plan
1) complete implementation
2) create a driver class to test implementation of Deque
3) optimize runtime

## Rationale
   (doubly-linked) node-based architecture is the most efficient data structure because it enables the deque to have enqueue() and dequeue() run in constant time. Furthermore, it bypasses the size restriction posed by an array-based deque(unless a new array is made).
   The methods are the fundamental characteristics of the ADT deque. iterator() is chosen due to it making FOREACH available in the class. 
