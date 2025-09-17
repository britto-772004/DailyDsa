import java.util.Scanner;

// Sample input and output 

// britto@britto-HP-250-G7-Notebook-PC:~/placement/100/codeforce$ java WayTooLongWords 
// 4
// word
// localization
// internationalization
// pneumonoultramicroscopicsilicovolcanoconiosis
// word
// l10n
// i18n
// p43s

public class WayTooLongWords{

    String logic(String str){
        int n = str.length();

        if(n>10){
            String output = "";
            output += str.charAt(0);
            output += n-2;
            output += str.charAt(n-1);
            return output;
        }
        return str;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        input.nextLine();

        String[] inputarray = new String[number];
        for(int i=0;i< number;i++){
            inputarray[i] = input.nextLine();
        }

        // answer is starts from here 

        WayTooLongWords obj = new WayTooLongWords();
        for(String element : inputarray){
            System.out.println(obj.logic(element));
        }

    }
}