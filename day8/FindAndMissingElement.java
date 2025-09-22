import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindAndMissingElement {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // finding the maximum number in 2d array
        int rowlength = grid.length;
        int columnlength = grid[0].length;

        int max = 0;
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<columnlength;j++){
                max = max(max,grid[i][j]);
            }
        }
        // System.out.println("max : "+max);

        int sumofnaturalnumber = ((max) *(max +1))/2;

        // find duplicate
        Set<Integer> set = new HashSet<>();
        int repeatedelement = -1;
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<columnlength;j++){
                if(set.contains(grid[i][j])){
                    repeatedelement = grid[i][j];
                    continue;
                }
                set.add(grid[i][j]);
            }
        }
        System.out.println(set);

        int sum = 0;
        for(int ele : set){
            sum += ele;
        }

        int missingnumber = sumofnaturalnumber - sum;
        if(missingnumber == 0){
            missingnumber = set.size();
            missingnumber++;
            System.out.println("missing number : "+missingnumber);
        }

        int[] output = new int[2];
        output[0] = repeatedelement;
        output[1] = missingnumber;
        return output;
    }

    static int max(int a,int b){
        if(a>b){return a;}
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rowsize = input.nextInt();
        int columnsize = input.nextInt();

        int[][] array = new int[rowsize][columnsize];

        for(int i=0;i<rowsize;i++){
            for(int j=0;j<columnsize;j++){
                array[i][j] = input.nextInt();
            }
        }

        input.close();
        FindAndMissingElement obj = new FindAndMissingElement();
        int[] result = obj.findMissingAndRepeatedValues(array);

        System.out.println("output: "+Arrays.toString(result));
    }
}
