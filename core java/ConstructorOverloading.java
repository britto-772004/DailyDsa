public class ConstructorOverloading{
    public static void main(String[] args){
        B a = new B(1);
    }
}

class A{
    A(){
        System.out.println("hi from A");
    }
}

class B extends A{
    B(){
        System.out.println("hi from B");
    }
    B(int hi){
        super();
        System.out.println("hi from B : "+hi);
        
        
    }
}