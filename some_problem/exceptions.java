import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exceptions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Java");
        list.add("Python");

        // Using an explicit Iterator to avoid ConcurrentModificationException
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            if (language.equals("Java")) {
                try {
                    // Remove the element using the iterator's remove method
                    iterator.remove();
                } catch (java.util.ConcurrentModificationException e) {
                    // Handle the ConcurrentModificationException
                    System.out.println("ConcurrentModificationException caught. Handling it...");
                }
            }
        }

        // Displaying the modified list
        System.out.println("Modified List: " + list);
    }
}

