import java.util.Scanner;

public class CreatingWords {

    static String check(String str){
        StringBuilder output = new StringBuilder(str);

        char temp = output.charAt(0);
        output.setCharAt(0,output.charAt(4));
        output.setCharAt(4, temp);

        return output.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        input.nextLine();
        for(int i=0;i<testcase;i++){
            String str = input.nextLine();
            System.out.println(check(str));
        }
        input.close();
    }
    
}
