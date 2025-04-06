package String;

import java.util.ArrayList;

public class findtheuniquecharacter {
    public static void main(String[] args) {

        String[] str={"abbcadah"};
        int k;
        for(int i=0;i<str.length;i++){
            ArrayList<String> ab=new ArrayList<String>();
            k=0;
            if(!ab.contains(str[i])){
                ab.add(str[i]);
                k++;
             for(int j=i+1;j<str.length;j++){
                if(str[i]==str[j]){
                    k++;
                }
            }
            System.out.println(str[i]);
            System.out.println(k);
            }


        }
    }
    
}
