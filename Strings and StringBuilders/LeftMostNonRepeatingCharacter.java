package GFGSELFPACED.STRINGS;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="aabbcddeffeggthihi";
        System.out.println(NonRep(str));
    }
    public static int NonRep(String str){
        for(int i=0;i<str.length();i++){
            boolean flag=false;

            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }return -1;
    }
}
