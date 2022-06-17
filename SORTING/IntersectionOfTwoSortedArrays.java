package GFGSELFPACED.SORTING;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={1,20,20,40,60};
        int[] b={1,20,20,20};

        intersection(a,b);



    }
    public static void intersection(int[] a , int[] b){
        int i=0;
        int j=0;
        int m=a.length;
        int n=b.length;

        while (i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }


    }
}
