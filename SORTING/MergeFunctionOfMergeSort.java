package GFGSELFPACED.SORTING;

import java.util.Arrays;

public class MergeFunctionOfMergeSort {
    public static void main(String[] args) {
        int[] arr={10,15,20,11,30};
        int low=0;
        int mid=2;
        int high=4;
        
        merge(arr,low,mid,high);
        System.out.println(Arrays.toString(arr));

    }
    public static void merge(int[] arr,int low,int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];

        }
        for(int i=0;i<n2;i++){
            right[i]=arr[n1+i];
        }

        int i=0;
        int j=0;
        int k=0;

        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(k<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
