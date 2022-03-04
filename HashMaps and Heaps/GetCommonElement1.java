package DSA.HashMaps;
import java.util.*;

public class GetCommonElement1 {
    public static void main(String[] args) {

        int[] a1={1,1,2,2,2,3,3,3,3,3,4,4};
        int[] a2={1,3,5,6,6,7};

        HashMap<Integer,Integer> fmap= new HashMap<>();
        for(int val:a1){
            if(fmap.containsKey(val)){
                int of= fmap.get(val);
                int nf=of+1;
                fmap.put(val,nf);
            }else{
                fmap.put(val,1);
            }

        }

        for(int val:a2){
            if(fmap.containsKey(val)){
                System.out.println(val);
                fmap.remove(val);
            }
        }
    }
}
