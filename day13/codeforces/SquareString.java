import java.util.Scanner;

public class SquareString{

    static boolean check(String str){
        int n = str.length();
        if(n%2 == 1){
            return false;
        }

        int i=0;
        int j=n/2;
        while(j<n){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        input.nextLine();
        for(int i=0;i<testcase;i++){
            String str = input.nextLine();
            if(check(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        input.close();
    }
}