
package java_practice;
import java.util.Scanner;


public class Half_piramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j;
            System.out.println("Enter the Number of row");
            n=sc.nextInt();
            for ( i = n-1; i>=0; i--) {
         
                
                    for (j =0; j<=i; ++j) {
                        
                        System.out.print(" * ");
                    }
          
                System.out.println("");
            
        }
    }
    
}
