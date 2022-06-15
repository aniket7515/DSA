package GFGSELFPACED.SEARCHING;

public class TripletSumInSortedArray {
    public static void main(String[] args) {
        int[] a={2,3,4,8,9,20,40};
        int sum=21;
        System.out.println(isSumPair(a,sum));


    }
    public static boolean isSumPair(int[] a,int sum){
        for(int i=0;i<a.length;i++){
            if(isPair(a,i+1,a.length-1,sum-a[i])){
                return true;
            }
        }return false;

    }
    public static boolean isPair(int[] arr , int left , int right , int sum){
        int n=arr.length;

        while(left<right){
            if(arr[left]+arr[right]==sum){
                return true;

            }
            else if(arr[left]+arr[right]>sum){
                right--;
            }else{
                left++;
            }
        }return false;
    }
}
