package leetcode;

public class MaximumAscending1800 {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;

        int max = nums[0];
        int tempsum = nums[0];
        
        for(int i=1;i<n;i++){
            if(nums[i-1] < nums[i]){
                tempsum += nums[i];
            }
            else{
                tempsum = nums[i];
            }

            if(tempsum > max){
                max = tempsum;
            }
        }

        return max;
    }
}
