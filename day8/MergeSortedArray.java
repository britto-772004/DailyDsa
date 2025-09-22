import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;

        while(m < nums1.length){
            if(i == m){
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;
            }
            else if(nums1[i] > nums2[j]){
                int k = m-1;
                while(k >= i){
                    nums1[k+1] = nums1[k];
                    k--;
                }
                nums1[i] = nums2[j];
                j++;
                m++;
            }
            else{
                i++;
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array - 1
        int size = input.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        // array - 2
        int size1 = input.nextInt();

        int[] array1 = new int[size];

        for(int i=0;i<size1;i++){
            array1[i] = input.nextInt();
        }
        
        input.close();
        
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(array, 2, array1, 2);
        System.out.println("Output : "+Arrays.toString(array));

    }
}
