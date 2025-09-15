public class DynamicArray{
    static DynamicArray hi;
    static{
        // System.out.println("hi");
        DynamicArray.hi = new DynamicArray();
        // DynamicArray hi;
        System.out.println(hi);
    }
    public static void main(String[] args){
        // DynamicArray h1 = new DynamicArray();
    }
}