package GFGSELFPACED.SORTING;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={23,12,34,64,23,123,23,11};
        BubbleSorts(arr);

//        in this we move the largest element to the last position by swapping the terms and second highest to second last and same continues


    }
    public static void BubbleSorts(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
