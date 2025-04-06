package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicatecharacterandoccurence {
    public static void main(String[] args) {
        String str= "Programming";
        int count=1;
       char[] c= str.toCharArray();
       Map<Character, Integer> d=new LinkedHashMap<Character, Integer>();
       for(Character a:c){
        if(d.containsKey(a)){
            d.put(a,d.get(a)+1);
        }
        else{
            d.put(a, count);
        }

       }
       for(Map.Entry<Character, Integer> entry:d.entrySet()){
        if (entry.getValue()>1){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
       }
    }
    
}
