import java.util.Arrays;

public class triplet{

    static int tripletCount(int[] array){
        Arrays.sort(array);

        int n = array.length;
        int count = 0;
        for(int i=0;i<n-3;i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = array[i] + array[left] + array[right];
                if(sum == 0){
                    count++;
                    break;
                }
                else if(sum > 0){
                    right--;
                }
                else {
                    left++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        int[] array = { -1,0,1,2,-1,-4};
        System.out.println("output : "+ tripletCount(array));
    }
}