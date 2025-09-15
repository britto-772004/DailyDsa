import java.util.Scanner;
import java.util.ArrayList;

public class ZeroAtLast{

    static ArrayList<Integer> approach_On2(ArrayList<Integer> list){
        int size = list.size();
        for(int i=0;i<size;i++){
            int element = list.get(i);
            if(element!= 0){
                continue;
            }
            for(int j=i+1;j<size;j++){
                int ele = list.get(j);
                if(ele != 0){
                    list.set(j,list.get(i));
                    list.set(i,ele);
                    break;
                }
            }
        }
        return list;
    }

    static ArrayList<Integer> optimalapproach(ArrayList<Integer> list){
        int n = list.size();

        int pointer = 0;

        for(int i=0;i< n ;i++){
            if(list.get(i)!= 0){
                list.set(pointer,list.get(i));
                pointer++;
            }
        }

        while(pointer < n){
            list.set(pointer,0);
            pointer++;
        }

        return list;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<size;i++){
            list.add(input.nextInt());
        }

        

        System.out.println(approach_On2(list));
        System.out.println(optimalapproach(list));
    }
}