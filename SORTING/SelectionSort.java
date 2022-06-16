package GFGSELFPACED.SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={10,5,8,20,2,18};
        Selectionsort(arr);

    }
    public static void Selectionsort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));


    }
}
