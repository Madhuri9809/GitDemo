package String;

public class ReverseEachWordWithoutChangingPosition {
    public static void main(String[] args) {
     String str="Programming is my Hobby"; 

     String[] s=str.split(" ");
     for(String m:s){
    String t="";
        for(int j=m.length()-1; j>=0; j--){
             t= t+ m.charAt(j);
          
        }
        System.out.print(t +" ");
        }
        
       } 
    
}
