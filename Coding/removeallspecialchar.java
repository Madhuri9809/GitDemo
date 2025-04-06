public class removeallspecialchar {
    public static void main(String[] args) {
        String str="@#$J#%^&A*@!V*&(A)_+";
        String str1=str.replaceAll("^[a-zA-Z0-9]","");
        System.out.println(str1);
        
    }
}
