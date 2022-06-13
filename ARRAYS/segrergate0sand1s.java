package GFGSELFPACED.ARRAYS;

import java.util.Arrays;
// move zeroes to left side and 1 to right side

public class segrergate0sand1s {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,0,0,1,1};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
