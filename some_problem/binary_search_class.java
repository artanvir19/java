
package java_practice;


public class binary_search_class {
    
    public static int binary_search(int a[],int n,int x)
    {
        int mid;
        int l=0,r=n-1;
        while(l<=r)
        {
        mid=(l+r)/2;
        if(a[mid]==x)
            return mid;
        else if(a[mid]<x)
            
             l=mid+1;
        else
           
        r=mid-1;
        }
        return -1;
    }
    
}
