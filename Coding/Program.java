public class Program{
    
    public static void main(String[] args) {
        String str= "j  a  v  a";
        //System.out.println("hello word");
       String plain =str.replaceAll(" ", "");
       System.out.println(plain);
       //aproach 1
       for(int i=plain.length()-1;i>=0;i--){
System.out.print(plain.charAt(i));
       }
       System.out.println();
       //APROACH 2
       for(int i=plain.length()-1;i>=0;i--)
       {
        char[] chararr=plain.toCharArray();
        System.out.print(chararr[i]);
       }
       System.out.println();
       //APPROACH 3
       StringBuilder sb=new StringBuilder(plain);
       System.out.println(sb.reverse());
       //APROACH 4
       StringBuffer sbf =new StringBuffer(plain);
       System.out.println(sbf.reverse());

    
    }
}