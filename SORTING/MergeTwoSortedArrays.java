package GFGSELFPACED.SORTING;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        // Efficient solution
        // first we will assign i=0 and j=0 to arr[] a and arr[] b respectively
        //and will compare  if b[j] is smaller than a[i] then j++ else i++
        int[] a={10,20,35};
        int[] b={5,50,50};
        merge(a,b);
    }
    public static void merge(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        int i=0;
        int j=0;

        while(i<m && j<n){
            if(a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(b[j]+" ");
            j++;
        }
    }
}
