package DSA.HashMaps;
import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class intro {
    public static void main(String[] args) {
        HashMap<String , Integer> hm= new HashMap<>();
        hm.put("India",135);
        hm.put("China",200);
        hm.put("srilanka" , 23);
        hm.put("US",34);
        hm.put("UK",20);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("Japan"));

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key+ " "+val);
        }
    }
}
