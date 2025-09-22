import java.util.Scanner;

public class TheSpy{

    static int backtrack(int[][] inputarray,int weight,int i,int j,int pathcount){
        if(i== inputarray.length && j== inputarray[0].length){
            return pathcount;
        }

        if(i<0 || i >=inputarray.length || j<0 || j>= inputarray[0].length || inputarray[i][j] > weight ){
            return 0;
        }

        
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        // input 
        int spyWeight = input.nextInt();

        int rowsize = input.nextInt();
        int columnsize = input.nextInt();

        int[][] inputarray = new int[rowsize][columnsize];

        for(int i=0;i<rowsize;i++){
            for(int j=0;j<columnsize;j++){
                inputarray[i][j]=input.nextInt();
            }
        }

        // solution


    }
}