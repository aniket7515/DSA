package GFGSELFPACED.ARRAYS;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr={6,6,6,4,6,6,8,5};
        System.out.println(findMajority(arr));

    }
    public static int findMajority(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return i;
            }
        }return -1;
    }
}
