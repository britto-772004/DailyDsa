package leetcode;

public class TheDifference389 {
    public char findTheDifference(String s, String t) {
        int slength = s.length();
        int tlength = t.length();

        int ssum = 0;
        for(int i=0;i<slength;i++){
            ssum += s.charAt(i);
        }

        int tsum = 0;
        for(int i=0;i<tlength;i++){
            tsum += t.charAt(i);
        }

        int diff = Math.abs(ssum - tsum);

        return (char) diff;
    }
}
