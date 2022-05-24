package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class ReverseArraysinGroups {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        ReverseArraysInGroups(arr,k);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] ReverseArraysInGroups(int[] arr,int k){
        int len=arr.length;

        for(int i=0;i<len;i=i+k){
            int start=i;
            int end=Math.min(i+k-1,len-1);

            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }
        return arr;
    }
}
