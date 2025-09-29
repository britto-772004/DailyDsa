

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Palindrome {
    static boolean check(String str){
        int n = str.length();

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int temp = map.get(str.charAt(i));
                map.put(str.charAt(i),temp+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        Set<Character> set = map.keySet();

        ArrayList<Integer> list = new ArrayList<>();

        for(Character ele :set ){
            int element = map.get(ele);
            if(list.contains(element)){
                return true;
            }
            list.add(element);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        String[] array = new String[testcase];
        for(int i=0;i<testcase;i++){
            array[i] = input.next();
        }
        input.close();

        for(int i=0;i<testcase;i++){
            boolean result = check(array[i]);
            if(result){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
