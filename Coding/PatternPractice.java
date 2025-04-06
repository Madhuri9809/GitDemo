public class PatternPractice {
    public static void main(String[] args) {
        int n=5;
        int mid = n /2 +1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if( i==1 || i==mid ||i==n || (j==n && i<mid) || (j==1 && i > mid)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if( i==mid ||j==mid || (i==n && j<mid) || (i==1 && j > mid) || (j==1 && i<mid) || (j==n && i>mid)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++)
            {
                
              System.out.print("* ");
                }
                System.out.println();
        
            }
            System.out.println();
            for(int i=1; i<=n; i++){
                for (int j=n; j>=1; j--){
                    if( i>=j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            for(int i=1; i<=n; i++){
                for (int j=1; j<=n; j++){
                    if( i>=j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            for(int i=1; i<=n; i++){
                for (int j=1; j<=n; j++){
                    if( i<=j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            for(int i=n; i>=1; i--){
                for (int j=1; j<=n; j++){
                    if( i>=j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
    }
    
}
