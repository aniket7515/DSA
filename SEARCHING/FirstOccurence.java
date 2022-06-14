package GFGSELFPACED.SEARCHING;

public class FirstOccurence {
    public static void main(String[] args) {
        // find the first occurence of the element in the sorted array
        int[] arr={5,10,10,20,20};
        int x=10;
        System.out.println(firstOcc(arr,x));
        
    }
    public static int firstOcc(int[] arr , int x){
        int low=0;
        int n=arr.length;
        int high=n-1;

        while(low<=high){
            int mid= (low + high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                if(mid ==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
