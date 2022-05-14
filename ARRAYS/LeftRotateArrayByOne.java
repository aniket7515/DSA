package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr={12,2,3,4,5,6,7};
        leftRotateByOne(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void leftRotateByOne(int[] arr){
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
    }
}
