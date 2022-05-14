package GFGSELFPACED.ARRAYS;

public class SecondHighestElement {
    public static void main(String[] args) {
//        to find the second highest element in array
        int[] arr1={7,5,6,1,4,2};
        int secondHighest=secondHighest(arr1);
        System.out.println("Second largest element in the array : "+ secondHighest);

    }

    public static int secondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                second_highest = highest;
                highest = arr[i];
            }else if(arr[i]>second_highest && arr[i]!=highest){
                second_highest=arr[i];
            }

        }
        return second_highest;

    }
}
