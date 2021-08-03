class Copycon{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Copycon(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Copycon(Copycon s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
        Copycon s1 = new Copycon(111,"Karan");  
        Copycon s2 = new Copycon(s1);  
    s1.display();  
    s2.display();  
   }  
}  