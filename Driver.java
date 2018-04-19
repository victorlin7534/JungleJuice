public class Driver{
    public static void main(String []args){
    	Deque<String> test1 = new QQKachoo<String>();
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
    	System.out.println(test1);
    	System.out.println(test1.isEmpty());
    	while(!test1.isEmpty()){
    		System.out.println(test1.peekFront() + "\t" + test1.dequeueFront());
    		System.out.println(test1.peekEnd() + "\t" + test1.dequeueEnd());
    	}
    	System.out.println(test1);
    	System.out.println(test1.isEmpty());
    }
}
