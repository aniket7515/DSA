package GFGSELFPACED.ARRAYS;

public class MaximumSum {
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        System.out.println(maxSum(arr));

    }
    public static int maxSum(int[] arr){
        int n=arr.length;
        int res=arr[0];

        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr=curr+arr[i];
                res=Math.max(res,curr);
            }
        }return res;
    }
}
