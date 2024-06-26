
 
package java_practice;
import java.util.Scanner;


public class PalindromeNumber_0r_not {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for (i= n; i!=0;i=i/10)
        {
            sum=(sum*10)+(i%10);
            
        }
        if(n==sum){
        System.out.println(sum+" is palindrome number ");
        
    }
        else{
            System.out.println(sum+" is not a palindrome number");
        }
     }
    
}
