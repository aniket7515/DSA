package GFGSELFPACED.STRINGS;

public class StringSubsequence {
    public static void main(String[] args) {


        String s1= "GEEKS FOR GEEKS";
        String s2="GRGES";

        System.out.println(isSubSeq(s1,s2));


    }
    public static boolean isSubSeq(String s1,String s2){
        int n=s1.length();
        int m=s2.length();

        int j=0;
        for(int i=0; i<n && j<m ; i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }

}
