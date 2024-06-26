
package java_practice;
import java.util.Scanner;


public class two_dimentional_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row and coloum");
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int a[][]=new int[n][m];
        
        System.out.println("Entet the elements of Array A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The Element of Array A are");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("index of a["+i+"]"+"["+j+"] is "+a[i][j]);
            }
        }
    }
    
}
