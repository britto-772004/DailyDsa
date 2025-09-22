import java.util.Scanner;

public class WordProblem{

    static int approach(String[] words,String word){
        int count = 0;
        for(String ele : words){
            if(word.equals(ele)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int size = input.nextInt();
        input.nextLine();
        String word = input.nextLine();

        String[] words = word.split(" ");

        int sizen = input.nextInt();
        String newWord = input.next();

        System.out.println(approach(words,newWord));
        
        input.close();
    }
}