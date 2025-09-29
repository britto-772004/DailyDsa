import java.util.Scanner;

public class StringEqualization {

    static boolean check(String str1, String str2){
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        String[][] array = new String[testcase][2];

        for(int i=0;i<testcase;i++){
            array[i][0] = input.next();
            array[i][1] = input.next();
        }

        input.close();

        for(int i=0;i<testcase;i++){
            if(check(array[i][0],array[i][1])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        


    }
}
