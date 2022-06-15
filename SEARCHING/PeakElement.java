package GFGSELFPACED.SEARCHING;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={5,10,20,15,7};
        System.out.println(getPeak(arr));

    }
    public static int getPeak(int[] arr){
        int n=arr.length;

        int low=0;
        int high=n-1;

        while (low<=high){
            int mid=(low+high)/2;

            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
                return arr[mid];
            }
            if(mid>0 && arr[mid-1]>=arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return -1;
    }
}
