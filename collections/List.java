package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
                li.add(1);
                li.add(2);
                li.add(3);
                li.add(4);
                LinkedList<String> al=new LinkedList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        Stack<String> stack = new Stack<String>();  
        stack.push("Ayush");  
        stack.push("Garvit");  
        stack.push("Amit");  
        stack.push("Ashish");  
        stack.push("Garima");  
        stack.pop();  
    }
}
