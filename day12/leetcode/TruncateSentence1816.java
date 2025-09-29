package leetcode;

public class TruncateSentence1816 {
    public String truncateSentence(String s, int k) {
        String[] array = s.split(" ");

        String output = "";

        for(int i=0;i<k;i++){
            output += array[i];
            output +=" ";
        }

        output = output.trim();
        return output;
    }
}
