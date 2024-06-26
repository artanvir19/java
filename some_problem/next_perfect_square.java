
package java_practice;
import java.util.Scanner;
import java.lang.Math;



public class next_perfect_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n,m,c=0;
        double r;
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n;
       while(c<1&&n<++m)
       {
           r=Math.sqrt(m);
           if (r==(int)r) {
            
            c++;
            System.out.println("next perfect Square "+m);
        }
           
       }  
    }
    
}