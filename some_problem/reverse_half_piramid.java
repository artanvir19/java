
package java_practice;
import java.util.Scanner;


public class reverse_half_piramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j;
            System.out.println("Enter the Number of row");
            n=sc.nextInt();
            for ( i = 0; i <n; i++) {
                for ( j = 0; j <=i; j++) {
                    
                        System.out.print(" * ");
                   
                   
                }
                System.out.println("");
            
        }
    }
    
}
