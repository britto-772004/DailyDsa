import java.util.Scanner;
import java.util.ArrayList;


class Stack{
    ArrayList<Character> list = new ArrayList<>();

    void push(char element){
        list.add(element);
    }

    void pop(){
        list.remove(list.size()-1);
    }

    char peek(){
        return list.get(list.size()-1);
    }
}

public class Downwithbracket{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        ArrayList<String> inputlist = new ArrayList<>();

        for(int i=0;i<number;i++){
            String str = input.next();
            inputlist.add(str);
        }

        System.out.println(inputlist);
        


        

        for(String str : inputlist){
            Stack stack = new Stack();

            stack.push('$');
            
            for(int i=0;i<str.length();i++){
            char ele = str.charAt(i);
            if(ele == '('){
                stack.push(str.charAt(i));
            }
            else {
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(')');
                }
            }
            
        }

        if(stack.peek() == '$'){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
        }
        
    }
    
}