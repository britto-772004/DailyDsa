package codeforces;

import java.util.Scanner;

public class DigitMinimization {

    static int helper(int number){
        String numStr = Integer.toString(number);

        if(numStr.length() > 2){
            int totalmin = Integer.MAX_VALUE;

            for(int i=0;i<numStr.length();i++){
                int temp = numStr.charAt(i) - '0';
                if(totalmin > temp){
                    totalmin = temp;
                }
            }

            return totalmin;
        }
        return numStr.charAt(numStr.length()-1) - '0';

        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        for(int i=0;i<testcase;i++){
            int number = input.nextInt();
            System.out.println(helper(number));
        }
        input.close();
    }
}
