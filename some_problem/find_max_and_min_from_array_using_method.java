package java_practice;
import java.util.Scanner;

public class find_max_and_min_from_array_using_method {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int maximum=max(arr,n);
        int minimum=min(arr, n);
        
          System.out.println("The maximum value of the array is "+maximum);
          System.out.println("The minimum value of the array is "+minimum);
    }

   public static int max(int a[],int n)
    {
        int i, maximum=a[0];
        
        for(i=0;i<n;i++)
        {
            if(a[i]>maximum)
                    
            {
                maximum=a[i];
            }
            }
            
          return maximum;  
        }


         public static int min (int a[],int n)
    {
        int i;
        int minimum=a[0];
        for(i=0;i<n;i++)
        {
           if(a[i]<minimum)
                    minimum=a[i];
                
            }
        return minimum;
            }
           
        
    

  
}
