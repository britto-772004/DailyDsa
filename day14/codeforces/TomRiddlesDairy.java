package codeforces;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TomRiddlesDairy{

    static boolean helper(List<String> list,String str){
        return list.contains(str);
    }
    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        input.nextLine();
        for(int i=0;i<testcase;i++){
            String str = input.nextLine();
            if(!helper(list,str)){
                System.out.println("No");
                list.add(str);
            }
            else{
                System.out.println("Yes");
            }
        }

        input.close();
        
    }
}