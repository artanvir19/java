package java_practice;


import java.util.Scanner;
 

public class factorial_of_n {
    public static int fct(int n)
    {
        
        if(n==0||n==1)
            return 1;
        return n*fct(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int fact =1,n;
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            
            fact*=i;
        }
        
        System.out.printf("The factorial of %d is %d\n",n,fact);
       
        fact=fct(n);
        System.out.println(fact);
    }
    
    
}
