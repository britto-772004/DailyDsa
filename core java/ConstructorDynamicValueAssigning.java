public class ConstructorDynamicValueAssigning{
    public static void main(String[] args){
        Student s1 = new Student("britto",20,true);
        s1.print();
    }
}



class Student{
    String name;
    int age;
    boolean local;
    boolean foreign;
    int fees;


    Student(String name,int age,Boolean local){

    }
        
    Student(){
        
    }

    void print(){
        // System.out.println("Name : "+s1.name);
        // System.out.println("Age : "+s1.age);
        // System.out.println("Local : "+s1.local);
        // System.out.println("Foreign : "+s1.foreign);
        // System.out.println("Fees : "+s1.fees);

        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Local : "+this.local);
        System.out.println("Foreign : "+this.foreign);
        System.out.println("Fees : "+this.fees);
    }

    
}