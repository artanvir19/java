
package java_practice;


 class Linear_search_class {
    
   public static int linear_search(int a[],int n,int x)
    {
        for (int i = 0; i < n; i++) {
            if (a[i]==x) {
                return i;
            }
            
        }
        return -1;
    }
    
}
