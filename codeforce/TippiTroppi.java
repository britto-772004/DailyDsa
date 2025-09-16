import java.util.Scanner;
import java.util.ArrayList;


public class TippiTroppi{

    void check(String[][] array){
        int row = array.length;

        for(int i=0;i<row;i++){
            int column = array[i].length;
            for(int j=0;j<column;j++){
                System.out.print(array[i][j].charAt(0));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.nextLine();

        String[][] strarr = new String[number][];

        for(int i=0;i<number;i++){
            String temp = input.nextLine();
            String[] hi = temp.split(" ");
            strarr[i] = hi;
        }

        TippiTroppi tp = new TippiTroppi();
        tp.check(strarr);

        // for(int i=0;i<number;i++){
        //     int size = strarr[i].length;
        //     for(int j=0;j<size;j++){
        //         System.out.print(strarr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}