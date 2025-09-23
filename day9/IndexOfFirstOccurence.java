import java.util.Scanner;

public class IndexOfFirstOccurence {

    public static int strStr(String haystack, String needle) {
        
        int pos = -1;
        for(int i =0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                
                pos = i;
                int j = 0;
                int k = 0;
                while(j< needle.length() && i < haystack.length()){
                    if(haystack.charAt(i) == needle.charAt(j)){
                        k++;
                    }
                    j++;
                    i++;
                }
                if(k == needle.length()){
                    // System.out.println("hi");
                    return pos;
                }
                i= pos;
                pos = -1;

            }
        }

        return pos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();

        input.close();

        System.out.println(strStr(str1, str2));

    }
    
}
