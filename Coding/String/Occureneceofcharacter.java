package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Occureneceofcharacter {
    public static void main(String[] args) {
        String str= "Programming";
        char [] a=str.toCharArray();
        int count=1;
        Map<Character,Integer> b= new LinkedHashMap<Character, Integer>();
      for(Character c:a){
            
            if(b.containsKey(c)){
                b.put(c, b.get(c)+1);
               
            }
            else{
                b.put(c,count); 
            }

        }

        for(Map.Entry<Character,Integer> entry:b.entrySet()){

           System.out.println(entry.getKey()+" "+entry.getValue());
    
        }
        
    }

}
