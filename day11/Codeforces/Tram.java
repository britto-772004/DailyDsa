package Codeforces;

import java.util.Scanner;

public class Tram {
    static int solution(int[][] array){
        int output = -1;

        int initial = 0;
        int row = array.length;
        for(int i=0;i<row;i++){
            initial -= array[i][0];
            initial += array[i][1];

            if(output < initial){
                output = initial;
            }
        }

        return output;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[][] array = new int[size][2];

        for(int i=0;i<size;i++){
            array[i][0] = input.nextInt();
            array[i][1] = input.nextInt();
        }
        input.close();

        System.out.println(solution(array));
    }
}
