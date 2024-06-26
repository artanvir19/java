
package java_practice;

public class thread extends Thread {
    private int value;
    
    public thread(int value)
    {
       this.value=value ;
    }
    
     public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(value);
        }
    }
   // 
    public static void main(String[] args) {
        
        thread t1=new thread(3);
        thread t2=new thread(4);
        t1.start();
        t2.start();
        
    }
    
}
