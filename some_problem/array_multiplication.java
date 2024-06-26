
package java_practice;
import java.util.Scanner;


public class array_multiplication {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1,m1,n2,m2,i,j,k;
        System.out.println("Enter the row and column of 1st Matrix");
        n1=sc.nextInt();
        m1=sc.nextInt();
        System.out.println("Enter the row and column of 2nd Matrix");
        n2=sc.nextInt();
        m2=sc.nextInt();
        
        int a[][]=new int[n1][m1];
        int b[][]=new int[n2][m2];
        int c[][]=new int[n1][m2];
        
             if(m1 != n2) {
    System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
    
}
             else{
         System.out.println("Enter the values of 1st matrix");
        for ( i = 0; i < n1; i++) {
            for ( j = 0; j < m1; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        
 

         System.out.println("Enter the values of 2nd matrix");
        for ( i = 0; i < n2; i++) {
            for ( j = 0; j < m2; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        
          System.out.println("1st matrix");
        for ( i = 0; i < n1; i++) {
            for ( j = 0; j < m1; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("2nd matrix");
        for ( i = 0; i < n2; i++) {
            for ( j = 0; j < m2; j++) {
                System.out.print(" "+b[i][j]);
            }
            System.out.println("");
        }
        
        for ( i = 0; i < n1; i++) {
            
            for ( j = 0; j < m2; j++) {
                c[i][j]=0;
                for ( k = 0; k < m1; k++) {
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
            
        }
        
        System.out.println("After Multiplication");
        
        
        for ( i = 0; i < n1; i++) {
            for ( j = 0; j < m2; j++) {
                System.out.print(" "+c[i][j]);
            }
            System.out.println("");
        }
        
    }
    }
    
}
