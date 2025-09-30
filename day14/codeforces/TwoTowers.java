package codeforces;

import java.util.Scanner;

public class TwoTowers {

    static boolean helper(StringBuilder str1,StringBuilder str2){

        str1.append(str2.reverse());

        int count = 0;
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i) == str1.charAt(i+1)){
                count++;
            }
        }

        if(count> 1){
            return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        for(int i=0;i<testcase;i++){
            int length = input.nextInt();
            int length2 = input.nextInt();
            input.nextLine();
            StringBuilder str1 = new StringBuilder(input.nextLine());
            StringBuilder str2 = new StringBuilder(input.nextLine());

            if(helper(str1, str2)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        input.close();
    }
}
