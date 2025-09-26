import java.util.Scanner;

public class ReverseString344 {

    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        char[] array = new char[length];

        for(int i=0;i<length;i++){
            array[i] = input.next().charAt(i);
        }
        input.close();
        reverseString(array);
        System.out.println(array.toString());
    }
    
}
