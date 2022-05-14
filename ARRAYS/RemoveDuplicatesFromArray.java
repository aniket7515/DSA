package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,6,7,7};
//        System.out.println(removeDupli(arr));

        removeDupli(arr);
    }
    public static void removeDupli(int[] arr){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
