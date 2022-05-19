package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class LeftRotateArrayByDElementsMethod2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=3;
        leftRotate(arr,d);

        System.out.println(Arrays.toString(arr));

    }
    public static void leftRotate(int[] arr,int d){
        int[] temp= new int[d];
        int n=arr.length;

        for(int i=0;i<d;i++){
            temp[i]=arr[i];

        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];

        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }

    }
}
