package GFGSELFPACED.STRINGS;

public class NaivePatternSearching {
    public static void main(String[] args) {
        String txt="ABABABCD";
        String pat="ABAB";

        PatSearching(txt,pat);

    }
    public static void PatSearching(String txt , String pat){
        int m=pat.length() , n=txt.length();

        for(int i=0;i<n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
        }

    }

}
