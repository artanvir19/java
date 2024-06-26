
package java_practice;
import java.util.Scanner;

public class factors_of_number {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j=0;
        System.out.println("Enter a Number");
        n=sc.nextInt();
        int a[]=new int[n/2];
        
        for ( i = 1; i <=n; i++) {
            
            if (n%i==0) {
                a[j++]=i;
            }
        }
        System.out.println("factors of "+n+" are");
        for (int k = 0; k < j; k++) {
            System.out.println(a[k]);
        }
    }
}
