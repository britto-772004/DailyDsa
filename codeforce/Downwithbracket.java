import java.util.Scanner;
import java.util.ArrayList;


public class Downwithbracket{

    static boolean check(ArrayList<String> list,String str){
        int number = str.length();
        int i = 0;
        int j = number -1;
        while(i<j){
            // System.out.print(str.charAt(i)+ " "+str.charAt(j));
            if(str.charAt(i) == ')'){
                return true;
            }
            if(str.charAt(i) == '('){
                if(str.charAt(j) == '('){
                    return true;
                }
            }

            
            i++;
            j--;
        }

        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        ArrayList<String> inputlist = new ArrayList<>();

        for(int i=0;i<number;i++){
            String str = input.next();
            inputlist.add(str);
        }

        System.out.println(inputlist);

        for(int i=0;i<number;i++){
            String str = inputlist.get(i);
            if(check(inputlist,str)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        }
        
        
        
    }
    
}