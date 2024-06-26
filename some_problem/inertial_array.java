

package java_practice;
import java.util.Scanner;

public class inertial_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
       int a[]=new int[n];
//   int b[];
//        b=new int[n];
        int temp,c=0,x=0,q=0,m=0,i,f=0;
        System.out.println("Enter the array element");
        for ( i = 0; i <n; i++) {
            a[i]=sc.nextInt();
          
        }
        int max;
//        x=0;
                max=a[0];
        for ( i = 0; i < n; i++) {
            if(max<a[i])
            {
                max=a[i];
                    m=i;
            }
            if(a[i]%2!=0)
            {
                c++;
                temp=a[i];
                if(a[i]<temp)
                   x=a[i];
                q=i;
            }
           
        }
//        System.out.println("max"+max+"c="+c+"x="+x+"m="+m);
        
        if(max%2==0&&c>0)
        {
            for ( i = 0; i <n; i++) {
                if(a[i]%2==0&&a[i]<x&&i!=m) 
                {
                f++;
                }
                 if(a[i]%2!=0&&a[i]>x&&i!=q)                                    
                    {
                    f++;
                    }
            }
            
            if(f==0)
            System.out.println("return 0");
      else 
            System.out.println("return 1");
            
        }
//        else
//            System.out.println("return 0");
        
      
        
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if(a[i]>a[j])
//                {
//                  temp=a[i];
//                  a[i]=a[j];
//                  a[j]=temp;
//                }
//            }
//                    
//        }
        
//        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//        }
//    
//        System.out.println("max"+max);
        
}
}
    

