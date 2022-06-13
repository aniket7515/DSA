package GFGSELFPACED.ARRAYS;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // Find the pair woth the given sum in array and to return there indices
        int[] arr={2,7,11,15};
        int target=18;

        System.out.println(Arrays.toString(TwoSumBruteForce(arr,target)));

    }
    public static int[] TwoSumBruteForce(int[] arr, int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==(target-arr[j])){
                    return new int[] {i,j};
                }
            }
        }throw new IllegalArgumentException("No pair is found");
    }
}
