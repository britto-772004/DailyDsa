import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(num)){
                int value = map.get(num);
                map.put(num,value+1);
            }
            else{
                map.put(num,1);
            }
        }

        Set<Integer> set = map.keySet();
        int answer = -1;
        for(int ele : set){
            if(map.get(ele) == 1){
                answer = ele;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        input.close();

        SingleNumber obj = new SingleNumber();
        System.out.println("Output : "+obj.singleNumber(array));

    }
}
