package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,6,8,12,23,45};
        int[] arr2={3,4,7,13,14};

        int[] ans=merge(arr1,arr2);

        System.out.println(Arrays.toString(ans));

    }
    public static int[] merge(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;

        int[] result=new int[n1+n2]; // made a new array of size n1+n2

        int i=0;
        int j=0;
        int k=0;

        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }else{
                result[k++]=arr2[j++];
            }
        }

        while(i<n1){
            result[k++]=arr1[i++];
        }
        while (i<n2){
            result[k++]=arr2[j++];
        }
        return result;
    }
}
