package GFGSELFPACED.SEARCHING;

public class Count1sinSBinaryArray {
    public static void main(String[] args) {
        // to count the ones in sorted binary array
        int[] arr={0,0,1,1,1,1};
        System.out.println(CountOnes(arr));
        
    }
    public static int CountOnes(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;

        while (low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid ==0 || arr[mid-1]==0){
                    return n-mid;
                }
                else{
                    high=mid-1;
                }
            }
        }return 0;
    }
}
