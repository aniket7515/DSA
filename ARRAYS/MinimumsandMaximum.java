package GFGSELFPACED.ARRAYS;

public class MinimumsandMaximum {
    public static void main(String[] args) {
        int[] arr={12,30,10,2,89,10};

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

        }

        System.out.println("the min is :"+min+"the max is"+max);
    }
}
