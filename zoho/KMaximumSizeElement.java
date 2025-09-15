import java.util.Scanner;
import java.util.ArrayList;


public class KMaximumSizeElement{

    static void myapproachBruteforce(ArrayList<Integer> list,int windowsize){
        int n = list.size();

        for(int i=0,j=windowsize -1;i<= (n-windowsize);i++,j++){

            int max = list.get(i);
            for(int k=i+1;k <= j;k++){
                if(list.get(k) > max){
                    max = list.get(k);
                }
            }
            System.out.print(max+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<size;i++){
            list.add(input.nextInt());
        }

        myapproachBruteforce(list,3);

    }
}