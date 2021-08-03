package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuejava {
public static void main(String[] args) {
    Queue<String> queue=new PriorityQueue<String>();
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek()); 
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:"); 
System.out.println(queue);
} 
}
