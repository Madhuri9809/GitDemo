package Array;

import java.util.ArrayList;

public class printuniquenumber {
    
    //print unique no from it
    //-this is for print the count of of number
    public static void main(String[] args) {
        int a[]= {4,5,5,5,4,6,6,9,4};
        int k; 
        //created empty arraylist to send the data from array which is scanned 
      ArrayList<Integer>  ab=new ArrayList<Integer>();
      for(int i=0; i<a.length;i++){
        k=0;
        if(!ab.contains(a[i])){
            ab.add(a[i]);
            k++;
            for(int j=i+1; j<a.length;j++){
                if(a[i]==a[j]){
                    k++;
                }
                
            }
            System.out.println(a[i]);
                System.out.println(k);

        }


      }

        
    }
    
}
