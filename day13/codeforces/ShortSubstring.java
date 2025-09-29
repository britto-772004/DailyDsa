import java.util.Scanner;

public class ShortSubstring {

    static String check(String str){
        StringBuilder output = new StringBuilder();
        int n = str.length();

        output.append(str.charAt(0));

        for(int i=1;i<n;){
            output.append(str.charAt(i));
            i+=2;
        }

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
