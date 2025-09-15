public class Rearrange012{
    

    // three pointer O(n)
    static int[] reaa(int[] array){
        int high = array.length -1 ;

        int low = 0;
        int mid = 0;

        while(mid <= high){
            if(array[mid] == 0){
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            }
            else if (array[mid] == 1){
                mid++;
            }
            else{
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
        return array;

        
    }

    public static void main(String [] args){
        int[] array = {1,2,1,0};
        array = reaa(array);

        for(int ele : array){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}