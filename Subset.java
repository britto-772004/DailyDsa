import java.util.ArrayList;
import java.util.List;

public class Subset{
    public static void main(String[] args){

        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {1,2,3};
        int n = nums.length;
        int total = 1 << n;
        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {  // check if i-th bit is 1
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }

        System.out.println(result);

    }
}