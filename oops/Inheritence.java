package oops;

class A{
    void running(){
        System.out.println("hello world");
    }
}
class B extends A{

}
class C extends A{
    void running(){
        super.running();
        System.out.println("hello moto");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        //defination in inheritance
        //calling child class property to other
        //it does note support multiple inheritance
        B b=new B();
        C c=new C();
        c.running();
        b.running();

    }
}
