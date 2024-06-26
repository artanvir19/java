
package java_practice;
import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Ente a number");
        n=sc.nextInt();
        for (i= n; n!=0;n=n/10)
        {
            sum=(sum*10)+(n%10);
            
        }
        System.out.println("The reverse Number is "+sum);
        
    }
    
}
