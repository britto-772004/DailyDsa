import java.util.HashMap;
import java.util.Scanner;

public class WordPattern290{
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();

        String[] array = s.split(" ");

        if(pattern.length() != array.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            
            if(map.containsKey(pattern.charAt(i))){
                
                String temp = map.get(pattern.charAt(i));
                if(!temp.equals(array[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(array[i])){
                    return false;
                }
                map.put(pattern.charAt(i),array[i]);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        input.nextLine();
        String str2 = input.nextLine();
        input.close();

        System.out.println(wordPattern(str1, str2));


    }
}