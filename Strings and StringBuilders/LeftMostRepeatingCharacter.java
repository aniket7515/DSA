package GFGSELFPACED.STRINGS;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String str="abcdbbbachdsf";
        System.out.println(leftmost(str));
    }
    public static final int CHAR=256;
    public static int leftmost(String str){
        boolean[] visited=new boolean[CHAR];

        int res=-1;

        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]){
                res=i;
            }else{
                visited[str.charAt(i)]=true;
            }
        }return res;
    }

}
