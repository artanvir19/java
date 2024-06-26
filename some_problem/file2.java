package java_practice;
import java.io.*;

public class file2 {
    public static void main(String[] args) {

        try {

            File directory = new File("IP tv");
            directory.mkdir();
            File directory2 =new File("D:\\Exercise\\file");
            directory2.mkdir();
            File file = new File("D:\\Exercise\\Java\\Java_practice\\IP tv\\new.txt");

            if (file.exists()) {
                if (file.canRead()) {
                    System.out.println("You can read");

                    if (file.canWrite()) {
                        FileWriter fw = new FileWriter(file);
                        fw.write("Welcome to Java");
                        fw.close();
                        System.out.println("Write successful");
                    } else {
                        System.out.println("Cannot write to the file");
                    }
                } else {
                    System.out.println("Cannot read the file");
                }
            } else {
                System.out.println("File doesn't exist");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

