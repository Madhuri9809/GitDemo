package Array;

public class findminnofrom3by3matrix {
    public static void main(String[] args) {
        int a[][]={{2,4,5},{3,8,7},{6,2,9}};
        int min=a[0][0];   
    
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(a[i][j]<min){
min=a[i][j];
            }
        }
    }
System.out.println(min);
    
}
    
}
