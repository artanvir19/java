
package java_practice;
import java.util.Scanner;


public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j,c=0,count=0;
        System.out.println("Enter Range :");
        n=sc.nextInt();
        int m=sc.nextInt();
        for ( i = n; i <=m; i++) {
            c=0;
            
        for ( j = 2; j <=i/2; j++) {
            if(i%j==0){
                c++;
            }
        }
        if(c==0){
            count++;
        }
        }
        System.out.println(count);
        
    }
    
}
