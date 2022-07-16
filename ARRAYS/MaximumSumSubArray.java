package PRACTISE;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        System.out.println(maxSumSubarray(arr));
    }
    // Kadanes algorithm 
    public static int maxSumSubarray(int[] arr){
        int n=arr.length;
        int curr_sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];
            res=Math.max(res,curr_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
        }return res;


    }

}
