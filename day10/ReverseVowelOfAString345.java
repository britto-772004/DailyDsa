import java.util.Scanner;

public class ReverseVowelOfAString345 {

    public static String reverseVowels(String s) {

        StringBuilder str = new StringBuilder(s);
        
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(isVowel(str.charAt(i))){
                while(true){
                    if(isVowel(str.charAt(j))){
                        char temp = str.charAt(i);
                        str.setCharAt(i,str.charAt(j));
                        str.setCharAt(j,temp);
                        i++;
                        j--;
                        break;
                    }
                    else{
                        j--;
                    }
                }
                
            }
            else{
                i++;
            }
        }
        return str.toString();
    }

    static boolean isVowel(char a){
        String check = "AEIOUaeiou";

        for(int i=0;i<check.length();i++){
            if(check.charAt(i) == a){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close();

        System.out.println(reverseVowels(str));

    }
    
}
