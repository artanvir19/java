
package java_practice;
import java.util.Scanner;


public class fibonacci_series {
    public static int fibonacci(int n)
    {
    if(n==0){
        return 0;
    }
    else if
            (n==1)
        return 1;
    else
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth number of fobonacci sereis");
        int n,fibonacci;
        n=sc.nextInt();
        System.out.println("Fibonacci serise upto place "+n);
        for (int i = 0; i <n; i++) {
             fibonacci= fibonacci(i);
            System.out.printf("%d ",fibonacci);
            
        }
        
        
    }
    
}
