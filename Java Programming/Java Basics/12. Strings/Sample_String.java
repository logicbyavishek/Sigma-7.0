import java.util.*;

public class Sample_String {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
        
        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Replace a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Split the string into an array
        String[] words = str.split(" ");
        System.out.println("Split String: " + Arrays.toString(words));
        
        // Get the length of the string
        int length = str.length();
        System.out.println("Length of String: " + length);
    }
}
