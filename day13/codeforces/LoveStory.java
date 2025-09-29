import java.util.Scanner;

public class LoveStory {

    static int check(String str){
        String mainstr = "codeforces";
        int count = 0;

        for(int i=0;i<10;i++){
            if(str.charAt(i) != mainstr.charAt(i)){
                count++;
            }
        }
        return count;
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
