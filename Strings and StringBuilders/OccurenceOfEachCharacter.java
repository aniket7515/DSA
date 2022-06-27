package GFGSELFPACED.STRINGS;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str="programming";

        Map<Character,Integer> characterMapCount=new HashMap<Character,Integer>();

        for(Character c:str.toCharArray()){
            if(characterMapCount.containsKey(c)){
                characterMapCount.put(c,characterMapCount.get(c)+1);
            }else{
                characterMapCount.put(c,1);
            }
        }
        System.out.println(characterMapCount);
    }

}
