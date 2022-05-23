package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class SortZeroesOnesandTwos {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,2,0,0,1,1,0};
        sortOnesTwos(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] sortOnesTwos(int[] arr){
        int zeroCount=0;
        int onesCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            if(arr[i]==1){
                onesCount++;
            }
        }

        for(int i=0;i<zeroCount;i++){
            arr[i]=0;
        }
        for(int i=zeroCount;i<(zeroCount+onesCount);i++){
            arr[i]=1;
        }
        for(int i=(zeroCount+onesCount);i<arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }

}
