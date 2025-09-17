import java.util.Scanner;

// sample input and output

// britto@britto-HP-250-G7-Notebook-PC:~/placement/100/codeforce$ java SkibidusOhio 
// 4
// abb
// skibidus
// cc
// ohio
// 1
// 8
// 1
// 4

public class SkibidusOhio{

    int logic(String str){
        int n = str.length();

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<n-1;i++){
            char element = sb.charAt(i);
            if(element == sb.charAt(i+1)){
                sb.deleteCharAt(i+1);
                if(i>0 && i<n){
                    sb.setCharAt(i,sb.charAt(i-1));
                    i=-1;
                    n=sb.length();
                }
                else if(i<n && sb.length()!=1){
                    sb.setCharAt(i,sb.charAt(i+1));
                    i=-1;
                    n=sb.length();
                }
            }
        }
        return sb.length();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        String[] inputarray = new String[num];
        input.nextLine();

        for(int i=0;i<num;i++){
            inputarray[i] = input.nextLine();
        }

        // execution of the program     
        SkibidusOhio obj = new SkibidusOhio();

        for(String element : inputarray){
            System.out.println(obj.logic(element));
        }

    }
}