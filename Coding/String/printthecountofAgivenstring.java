package String;
//import java.util.LinkedHashMap;
//import java.util.Map;
public class printthecountofAgivenstring{
    public static void main(String[] args) {
    String str="AbcdAjhnmaqml";
    char[] a=str.toCharArray();
    //Map<Character,Integer> b=new LinkedHashMap<Character,Integer>();
    int count=0;
    for (Character c:a){
        if (c=='A'|| c=='a'){
            count++;
            
            
        }
        
    }
    System.out.println("count of A present in String"+" " +count);


}
}