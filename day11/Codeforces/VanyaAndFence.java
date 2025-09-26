package Codeforces;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int weight = input.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        input.close();
        int sum =0;

        for(int ele : array){
            if(ele > weight){
                sum +=2;
            }
            else{
                sum +=1;
            }
        }
        System.out.println(sum);
    }
}
