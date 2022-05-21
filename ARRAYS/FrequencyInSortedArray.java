package GFGSELFPACED.ARRAYS;

public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,2,3,4,4,5,6,6,6,6};
        printFreq(arr);

    }
    public static void printFreq(int[] arr){
        int freq=1;
        int i=1;
        int n=arr.length;

        while (i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " "+freq);
            i++;
            freq=1;

        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }
    }
}
