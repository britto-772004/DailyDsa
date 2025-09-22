import java.util.Scanner;


public class MaximumSubArray{

    static int approach(int[] array){
        int maximum = 0;
        int curr = 0;
        
        for(int ele : array){
            curr += ele;
            curr = max(curr,ele);
            maximum = max(curr,maximum);
        }

        return maximum;
    }
    static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = input.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }

        System.out.println("Output : "+ approach(array));

        input.close();
    }
}