import java.util.Scanner;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid -1;
            }
            else{
                
                low = mid +1;
            }
        }

        return low ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        int target = input.nextInt();
        System.out.println("Output : "+searchInsert(array, target));
        input.close();
    }
}
