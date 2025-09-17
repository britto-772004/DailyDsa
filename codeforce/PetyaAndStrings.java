
import java.util.Scanner;

public class PetyaAndStrings{
    int logic(StringBuilder s1,StringBuilder s2){
        int n = s1.length();

        boolean flag = false;
        for(int i=0;i<n;i++){
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            // System.out.print("c1 : "+c1+ " c2 : "+c2);
            if((c1 - c2) == 32 || (c1 - c2) == -32 || (c1 - c2) == 0){
                flag = true;
            }
            else if((c1 - c2) < 32 || (c1 - c2) > -32 && (c1 - c2) <0 ){
                return -1;
            }
            
            else{
                return 1;
            }
        }
        if(flag){
            return 0;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        StringBuilder s1 = new StringBuilder(input.nextLine());
        StringBuilder s2 = new StringBuilder(input.nextLine());
        // System.out.println(s1+" "+s2);

        // logic

        PetyaAndStrings obj = new PetyaAndStrings();
        System.out.println(obj.logic(s1,s2));
    }
}