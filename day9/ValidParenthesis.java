import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        stack.push('$');

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(')');
                }
            }
            else if(s.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    stack.push('}');
                }
            }
            else{
                if(stack.peek() == '['){
                    stack.pop();
                }
                else{
                    stack.push(']');
                }
            }
            }
            
            
        }

        if(stack.peek() == '$'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        input.close();

        System.out.println(isValid(str));
    }
    
}
