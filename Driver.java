import java.util.Iterator;

public class Driver{
    public static void main(String []args){
    	QQKachoo<String> test1 = new QQKachoo<String>();

    	System.out.println(test1.isEmpty());

    	test1.enqueueFront("cat");
    	test1.enqueueEnd("cat");
    	test1.enqueueFront("dog");
    	test1.enqueueEnd("dog");
    	test1.enqueueFront("elephant");
    	test1.enqueueEnd("elephant");
    	test1.enqueueFront("child");
    	test1.enqueueEnd("child");
    	test1.enqueueFront("flag");
    	test1.enqueueEnd("flag");
    	test1.enqueueFront("pear");
    	test1.enqueueEnd("pear");
        test1.enqueueFront("F");
        test1.enqueueEnd("E");

    	System.out.println(test1);
    	System.out.println(test1.isEmpty());

    	System.out.println("\ntest iterator");
    	for(String x:test1)
    		System.out.println(x);

        System.out.println("\ntest diterator");
        Iterator<String> it = test1.diterator();
        while(it.hasNext())
            System.out.println(it.next());

    	System.out.println("\nremoveing");
    	while(!test1.isEmpty()){
    		System.out.println(test1.peekFront() + "\t" + test1.dequeueFront());
    		System.out.println(test1.peekEnd() + "\t" + test1.dequeueEnd());
    	}

    	System.out.println("\n"+test1);
    	System.out.println(test1.isEmpty());


	QQKachoo<String> itestf = new QQKachoo<String>();
	QQKachoo<String> iteste = new QQKachoo<String>();
	for (int i = 0; i<10; i++){
	    itestf.enqueueFront(i+"");
	    iteste.enqueueFront(i+"");
	    
	}

	Iterator<String> f = itestf.iterator();
	Iterator<String>e=iteste.diterator();

	
	System.out.println(itestf);

	while (f.hasNext()){
	    System.out.print(f.next()+ " ");
	    f.remove();
	}
	System.out.println(itestf);
	System.out.println(iteste);

	while (e.hasNext()){
	    
	    System.out.print(e.next()+ " ");
	    e.remove();
	}
	System.out.println(iteste);
    }
}
