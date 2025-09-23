import java.util.Scanner;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return array[array.length -1].length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        input.close();

        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println("output : "+obj.lengthOfLastWord(str));
    }
}
