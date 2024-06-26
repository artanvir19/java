
package java_practice;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for( int i:arr)
        {
            arr[i]=sc.nextInt();
        }
        
//      for(int i:arr)
//      {
//          System.out.println(arr[i]);
//      }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
