/*
  Driver by Team Yahoo Search -- Bing Li, Lily Yan, Selina Zou
*/

public class QQKchDriver {
    public static void main(String[] args) {
	QQKachoo<String> mister = new QQKachoo<String>();

	System.out.println("\nEnqueueing deque mister...");

	mister.enqueueEnd("and");
	mister.enqueueEnd("there's");
	mister.enqueueEnd("nobody");
	mister.enqueueEnd("around");

	mister.enqueueFront("forest");
	mister.enqueueFront("a");
	mister.enqueueFront("in");
	mister.enqueueFront("falling");
	mister.enqueueFront("you're");
	mister.enqueueFront("when");
	System.out.println("\nmister after enqueing: " + mister);

	System.out.println("\n\nIterating through mister: \n");
	for (String s: mister) System.out.println("Current element: " + s);

	System.out.println("\n\nDequeueing mister: ");
	while (! mister.isEmpty()) {
	    int firstOrLast = (int)(Math.random() * 2); //determines whether to remove element at front or end of deque
	    if (firstOrLast == 0) { 
		System.out.println("\nRemoving element at FRONT of deque...");
		System.out.println("Element at front: " + mister.peekFront());
		System.out.println("Element removed: " + mister.dequeueFront());
	    }

	    else {
	        System.out.println("\nRemoving element at END of deque...");
		System.out.println("Element at end: " + mister.peekEnd());
		System.out.println("Element removed: " + mister.dequeueEnd());
	    }

	    System.out.println("Deque after dequeue: " + mister);
	}	   
	/* ~~~~~~~~~~~~MOVE ME DOWN~~~~~~~~~~~~~
	   ~~~~~~~~~~~~YOU MADE IT~~~~~~~~~~~~~~~ */
    }
}
