package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {

        int[] arr={12,32,54,64,4,646};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }


    }

}
