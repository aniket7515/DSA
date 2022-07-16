package GFGSELFPACED.ARRAYS;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr={6,6,6,4,6,6,8,5};
        System.out.println(findMajority(arr));
        System.out.println(findMajorityMoores(arr));

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
    // Moores voting algorithm
    // 1) we find the majority elelemt in first step and in step 2
    // 2) we check the possible majority element
    public static int findMajorityMoores(int[] arr){
        int res=0,count=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }

        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            if(count>n/2){
                return res;
            }
        }return -1;
    }
}
