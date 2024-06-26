
package java_practice;
import java.util.Scanner;


public class Inverse_half_piramid {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j;
            System.out.println("Enter the Number of row");
            n=sc.nextInt();
            for ( i = n; 0 <i; i--) {
         
                
                    for (j =i; j>0; j--) {
                        
                        System.out.print(" * ");
                    }
          
                System.out.println("");
            
        }
    }
    
}

    

