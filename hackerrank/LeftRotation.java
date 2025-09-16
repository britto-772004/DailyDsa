import java.util.Scanner;

public class LeftRotation{


    int[] rotate(int[] array,int d){
        int n = array.length;

        d = d % n;

        int[] newarray = new int[n];

        for(int i=0;i<n;i++){
            int index = (i-d+n) % n;
            newarray[index] = array[i];
        }

        return newarray;
    }

    void rotate2(int[] array,int d){
        int n = array.length;
        d = d % n;

        LeftRotation l1 = new LeftRotation();

        l1.reverse(array,0,d-1);
        l1.reverse(array,d,n-1);
        l1.reverse(array,0,n-1);
    }

    void reverse(int[] array,int i,int j){
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        System.out.print("Enter the steps to rotate : ");
        int d = input.nextInt();

        System.out.println("Enter the "+n+" elements ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        // create object 

        LeftRotation obj = new LeftRotation();
        int[] result = obj.rotate(arr,d);

        for(int ele : result){
            System.out.print(ele+" ");
        }

        System.out.println();

        obj.rotate2(arr,d);

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();

        
    }

}