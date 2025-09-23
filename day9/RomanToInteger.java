import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger{
    public static int romanToInt(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        

        int sum = 0;

        for(int i= s.length()-1; i>=0;i--){
            int temp = map.get(s.charAt(i));
            String ss = Integer.toString(temp);
            int newtemp = 0;
            if(ss.charAt(0) == '1'){
                newtemp = temp * 5;
            }
            else{
                newtemp = temp *10;
            }
            if(sum < newtemp){
                sum += temp;
            }
            else{
                sum -= temp;
            }
            
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        input.close();
        System.out.println(romanToInt(str));

    }
}