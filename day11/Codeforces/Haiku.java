package Codeforces;

// import java.util.Arrays;
import java.util.Scanner;

public class Haiku {
    static boolean isVowel(char a){
        String str = "AEIOUaeiou";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == a){
                return true;
            }
        }
        return false;
    }

    static boolean solution(String[] array){

        int[] vowel = {5,7,5};

        for(int i=0;i<3;i++){
            int vowelcount = vowel[i];
            int count = 0;
            for(int j=0;j<array[i].length();j++){
                if(isVowel(array[i].charAt(j))){
                    count++;
                }
            }
            // System.out.println("vowel count : "+vowelcount+" count : "+count);
            if(vowelcount != count){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] array = new String[3];

        for(int i=0;i<3;i++){
            array[i]= input.nextLine().trim();
        }
        input.close();

        // System.out.println(Arrays.toString(array));

        boolean hi = solution(array);
        if(hi){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        
    }
}
