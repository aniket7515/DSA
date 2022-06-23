package GFGSELFPACED.HASHING;

import java.util.HashSet;

public class PairWithgivenSumUnsorted {
    public static void main(String[] args) {
        int[] arr={3,2,8,15,-8};
        int sum=17;
        System.out.println(isPair(arr,sum));

    }
    public static boolean isPair(int[] arr , int sum){
        int n=arr.length;
        HashSet<Integer> s= new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(s.contains(sum-arr[i])){
                return true;
            }
            s.add(arr[i]);
        }return false;
    }

}









