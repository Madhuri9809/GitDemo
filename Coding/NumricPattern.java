public class NumricPattern {
    public static void main(String[] args) {
        int n=5;
        int x=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
               
             System.out.printf("%d ", i+j-1);
                
             
            }
             
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
               
             System.out.printf("%d ", i*j);
                
             
            }
            //x++;
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
               
             System.out.printf("%d ", x-i);
                
             x++;
            }
             
            System.out.println();
        }
        System.out.println();
        int y=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
               
             System.out.printf("%d ", y*y);
                
             y++;
            }
             
            System.out.println();
        }
        System.out.println();
        int m=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                
               
             System.out.printf("%d ", m);
             m++; 
             
            }
             
            System.out.println();
           
        }
        for(int k=5; k>=1; k--){
            for (int d=1; d<=k; d++){
               
             System.out.printf("%d ", x);
                
             
            }
            x++;
             
            System.out.println();
        }
    }
    
}
