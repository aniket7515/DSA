package GFGSELFPACED.ARRAYS;

public class MaximumDifference {
    public static void main(String[] args) {
//        Naive solution
        // Maximum value of arr[j[-arr[i] such that j>i
        int[] arr={12,23,34,546,57,5,46,46,56};
        System.out.println(maxDiff(arr));

    }
    public static int maxDiff(int[] arr){
        int n=arr.length;
        int res=arr[1]-arr[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
}
