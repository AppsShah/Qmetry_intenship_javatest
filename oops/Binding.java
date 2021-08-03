// package oops;

class A{
    void running(){
        System.out.println("hi");
    }
}
class B extends A{
    void running(){
        System.out.println("hello");
    }
}
public class Binding {
    public static void main(String[] args) {
        //static binding 
    A a=new A();
    a.running();
    //dynamic binding
    A b=new B();
    b.running();
    }
}
