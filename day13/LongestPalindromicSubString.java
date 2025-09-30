import java.util.Scanner;

public class LongestPalindromicSubString {

    String helper(String inputstr){
        String output = "";

        String str = "$";
        int n = inputstr.length();

        for(int i=0;i<n;i++){
            str += inputstr.charAt(i);
            str += "$";
        }
        n= str.length();

        int totalmax =0;
        int i=0;
        while(i<n){
            int pointer_left = i;
            int pointer_right = i;
            int tempcount = 0;
            
            while(pointer_left >=0 && pointer_right < n){
                if(str.charAt(pointer_left) == str.charAt(pointer_right)){
                    tempcount++;
                }
                else{
                    break;
                }
                pointer_left--;
                pointer_right++;
            }

            if(tempcount > totalmax){
                totalmax = tempcount;
                output = str.substring(pointer_left+1, pointer_right);
            }
            // System.out.println("Output : "+output);
            i++;
        }

        String answer = "";

        for(int j=0;j<output.length();j++){
            if(output.charAt(j) != '$'){
                answer += output.charAt(j);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        LongestPalindromicSubString obj = new LongestPalindromicSubString();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.next();
        input.close();
        System.out.println("output : "+obj.helper(str));
    }
}
