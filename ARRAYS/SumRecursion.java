package GFGSELFPACED.ARRAYS;

public class SumRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,4,45,6,65,757,8,2};

        System.out.println(sumOfArray(arr,arr.length));

    }
    public static int sumOfArray(int[] arr,int n){
        if(n<=0){
            return 0;
        }
        return (sumOfArray(arr,n-1)+arr[n-1]);
    }
}
