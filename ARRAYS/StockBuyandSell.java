package GFGSELFPACED.ARRAYS;

public class StockBuyandSell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(StockBuyandSell(arr));

    }
    public static int StockBuyandSell(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]-min >max){
                max=arr[i]-min;
            }
        }
        return max;
    }
}
