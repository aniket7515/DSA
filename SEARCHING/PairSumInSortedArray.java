package GFGSELFPACED.SEARCHING;

public class PairSumInSortedArray {
    public static void main(String[] args) {

        // here we have used two pointer approach
        int[]arr={2,5,8,12,30};
        int x=17;

        System.out.println(isPair(arr,x));

    }
    public static boolean isPair(int[] arr,int x){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while (left<right){
            if(arr[left]+arr[right]==x){
                return true;
            }
            else if(arr[left]+arr[right]>x){
                right--;
            }
            else{
                left++;
            }
        }return false;

    }
}
