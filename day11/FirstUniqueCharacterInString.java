import java.util.Scanner;

public class FirstUniqueCharacterInString {
    public static int firstUniqChar(String s) {

        int[] array = new int[26];

        for(int i=0;i<s.length();i++){
            char ele = s.charAt(i);
            array[ele - 'a']++;
        }

        int index = -1;

        for(int i=0;i<s.length();i++){
            char ele = s.charAt(i);

            int count = array[ele - 'a'];

            if(count == 1){
                index = i;
                break;
            }
        }

        return index;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        input.close();

        System.out.println("Output : "+firstUniqChar(str));
    }
}
