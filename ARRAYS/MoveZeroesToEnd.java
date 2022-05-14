package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,34,566,0,0,43,45};
        moveToEnd(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void moveToEnd(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
//                swap(arr[i],arr[count]);
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;

            }
        }
    }

}
