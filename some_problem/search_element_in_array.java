package java_practice;

import java.util.Scanner;



public class search_element_in_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what search would you want to do");
        System.out.println("1.Linear Search");
        System.out.println("2.Binary Search");
        System.out.println("Enter choice");
        int c = sc.nextInt();
        switch (c) {
            case 1:

               int n,x;
                System.out.println("Enter the size of array");
                n=sc.nextInt();
                int a[]=new int[n];
                System.out.println("Enter the array element ");
                for (int j = 0; j < n; j++) {
                    a[j] = sc.nextInt();

                }
                System.out.println("Enter the search Item");
                x=sc.nextInt();
                
                Linear_search_class linearsearch=new Linear_search_class();
                
                int r=linearsearch.linear_search(a,n,x);
                if(r==-1)
                {
                    System.out.println("Search item is not found");
                }
                else
                {
                    System.out.println("Search item found at index "+(r+1));
                }
                break;
            
            case 2:
                int m,y;
                System.out.println("Enter the size of array");
                m=sc.nextInt();
                int b[]=new int[m];
                System.out.println("Enter the array element ");
                for (int j = 0; j < m; j++) {
                    b[j] = sc.nextInt();

                }
                System.out.println("Enter the search Item");
                y=sc.nextInt();
                
                binary_search_class binarysearch=new binary_search_class();
                
                int s=binarysearch.binary_search(b,m,y);
                if (s==-1) {
                    System.out.println("Search item is not found");
                }
            
            else    
                {
                    System.out.println("Search item found at index "+(s+1));
                }
                break;
                
                
                
                

        }

    }

}
