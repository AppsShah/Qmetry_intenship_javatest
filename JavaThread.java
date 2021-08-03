class Apps extends Thread{
    Apps(){
        
    }
    Apps(String name){
            super(name);
    }
    public void run(){
        System.out.println("Thread is running");
    }
}
public class JavaThread {

    public static void main(String[] args) {
        Apps a1=new Apps("hello");
        a1.start();
        Apps a2=new Apps();
        a2.start();
        System.out.println(a1.getName()+" "+a2.getName()+" "+a1.getId()+" "+a2.getId());
        
    }
}
