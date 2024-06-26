
package java_practice;
import java.util.Scanner;


public class array_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter the size of matrix");
        n=sc.nextInt();
        m=sc.nextInt();
        
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int c[][]=new int[n][m];
        
        System.out.println("Enter the values of 1st matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        
         System.out.println("Enter the values of 2nd matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
            
        }
        
        System.out.println("1st matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("2nd matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" "+b[i][j]);
            }
            System.out.println("");
        }
        
        
        System.out.println("Sum of two matrix is given below");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  "+c[i][j]);
            }
            System.out.println("");
        }
    }
    
}
