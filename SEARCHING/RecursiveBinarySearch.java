package GFGSELFPACED.SEARCHING;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] arr={1,2,3,5,6,7,8,89};
        int x=7;
        int low=0;
        int high=arr.length-1;

        System.out.println(bSearch( arr, low,high,x));



    }
    public static int bSearch(int[] arr, int low,int high,int x){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;

        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return bSearch(arr,low,mid-1,x);
        }else{
            return bSearch(arr,mid+1,high,x);
        }
    }
}
