import java.util.ArrayList;

public class Backtrack {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        backtrack(list,array, 0);
        System.out.println(list);   
    }

    static void backtrack(ArrayList<Integer> list, int[] array,int i){
        if(i > array.length-1){
            return;
        }
        list.add(array[i]);
        backtrack(list,array, i+1);
    }
}
