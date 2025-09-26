package Codeforces;

import java.util.Scanner;

public class TalesOfSort {
    static int solution(int[] array){
        int answer = 0;

        int n = array.length;

        int end = -1;

        for(int j=n-2;j>=0;j--){
            if(array[j-1] > array[j]){
                end = j;
                break;
            }
        }

        

        for(int i=0;i<=end;i++){
            if(array[i] > answer){
                answer = array[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        for(int i=0;i<testcase;i++){
            int size = input.nextInt();

            int[] array = new int[size];

            for(int j=0;j<size;j++){
                array[j] = input.nextInt();
            }

            System.out.println(solution(array));
            System.out.println("hi");
        }
        input.close();
    }
}
