package GFGSELFPACED.HASHING;

import java.util.HashSet;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int[] arr={1,4,13,-3,-10,5};
        System.out.println(is0SubArray(arr));

    }
    public static boolean is0SubArray(int[] arr){

        HashSet<Integer> h= new HashSet<>();
        int pre_sum=0;

        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(h.contains(pre_sum)){
                return true;
            }
            if(pre_sum==0){
                return true;
            }
            h.add(pre_sum);
        }
        return false;

    }
}
