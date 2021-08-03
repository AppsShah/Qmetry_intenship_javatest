package oops;

class Vehicle{  
    void run(){System.out.println("Vehicle is running");}  
  }  
class Bike{
    void run(){
        System.out.println("Bike running");
    }
}
class A{
    void running(){
        System.out.println("hello world");
    }
}
class C extends A{
    void running(){
        super.running();
        System.out.println("hello moto");
    }
}
class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }
public class Polymorphism {
    public static void main(String[] args) {
        //method overloading
        System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11)); 
        //moethod overriding
        Bike b=new Bike();
        b.run();
        //super keyword
        C c=new C();
        c.running();
        //final keyword
        // class F{
        //     final int q=1234;
        //     void temp(){
        //         // q=456;
        //         //if we try to change show error
        //     }
        // }

    }
}
