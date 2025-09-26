import java.util.Scanner;

public class RansomNote{
    public static boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length() ){
            return false;
        }

        int[] magazinearray = new int[26];

        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            magazinearray[c-'a']++;
        }

        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(magazinearray[c-'a'] == 0){
                return false;
            }

            magazinearray[c-'a']--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();

        input.close();

        System.out.println("Output : "+canConstruct(str1, str2));

    }
}