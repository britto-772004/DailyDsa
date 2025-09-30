package codeforces;

import java.util.Scanner;
import java.util.Arrays;

public class SubsequencePermutation {

    static int helper(String str){
        char[] array = str.toCharArray();

        Arrays.sort(array);

        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != array[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        for(int i=0;i<testcase;i++){
            int length = input.nextInt();
            String str = input.next();
            System.out.println(helper(str));
        }
        input.close();
    }
    
}
