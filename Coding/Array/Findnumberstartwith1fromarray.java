package Array;

import java.util.ArrayList;

public class Findnumberstartwith1fromarray {
   static int a[]={1,23,123,45,167,10,11,12,981,91,19};
    int num;

    public static int getstartingdigitofthenumber(int num){
while(num>=10){
    num=num/10;
    }
    return num;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int Num:a){
          int n = getstartingdigitofthenumber(Num);
          if(n==1){
            arr.add(Num);
          }
        }
        System.out.println((arr));
    }
    
}
