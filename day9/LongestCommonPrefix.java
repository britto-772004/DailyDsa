import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        

        // minimum length 
        int min = Integer.MAX_VALUE;

        String minstr = "";

        for(String str : strs){
            if(str.length() < min){
                min = str.length();
                minstr = str;
            }
        }
        System.out.println("Minstr : "+minstr);

        String output = "";
        for(int i=0;i<minstr.length();i++){
            char ele = minstr.charAt(i);
            boolean flag = false;
            System.out.println("ele "+ele);

            for(int j=0;j<strs.length;j++){
                if(ele == strs[j].charAt(i)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                output += ele;
            }
            else{
                break;
            }
        }

    return output;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int strlength = input.nextInt();

        String[] strarr = new String[strlength];

        for(int i=0;i<strlength;i++){
            strarr[i] = input.next();
        }
        input.close();

        System.out.println(longestCommonPrefix(strarr));
    }
}
