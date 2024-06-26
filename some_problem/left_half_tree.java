
package java_practice;

import java.util.Scanner;

public class left_half_tree {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of row");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
             System.out.println("");
            
           
        }
    }
}
