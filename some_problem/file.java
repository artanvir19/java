
package java_practice;
import java.io.*;
//import java.io.File;


public class file {
    public static void main(String[] args) {
        try{
        File file=new File("java123.txt");
        if(file.createNewFile())
        {
            System.out.println("creat new file");
            System.out.println(" location "+file.getAbsolutePath());
            
                 
                File n=new File("hi.txt");
        
        if(file.renameTo(n))
        {
            System.out.println("rename");
         
        }
    
        }
        else
        {
            System.out.println("file already exist");
            System.out.println(" location "+file.getAbsolutePath());
        }
    }
        catch(IOException e)
        {
            System.out.println("error "+e.getMessage());
            e.getStackTrace();
        }
        
        
   
}
}
