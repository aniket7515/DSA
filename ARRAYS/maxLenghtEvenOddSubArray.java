package PRACTISE;

public class maxLenghtEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,6,9,10};
        System.out.println(MaxEvenOdd(arr));

    }
    public static int MaxEvenOdd(int[] arr){
        int res=1;
        int curr=1;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0) ){
                curr++;
                res=Math.max(res,curr);
            }else {
                curr=1;
            }
        }return res;

    }
}
