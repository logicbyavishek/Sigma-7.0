public class Sample2 {
    public static void main(String[] args) {
        String str ="abcd";
        String str2 = "abcd";
        String str3 = new String("abcd");
        String str4 = new String("abcd");

        if(str == str2) {
            System.out.println("str and str2 are the same object in memory.");
        } else {
            System.out.println("str and str2 are different objects in memory.");
        }
        if(str3 == str4) {
            System.out.println("str3 and str4 are the same object in memory.");
        } else {
            System.out.println("str3 and str4 are different objects in memory.");
        }
        if(str.equals(str2)) {
            System.out.println("str and str2 have the same content.");
        } else {
            System.out.println("str and str2 have different content.");
        }
        if(str3.equals(str4)) {
            System.out.println("str3 and str4 have the same content.");
        } else {
            System.out.println("str3 and str4 have different content.");
        }
        if(str == str3) {
            System.out.println("str and str3 are the same object in memory.");
        } else {
            System.out.println("str and str3 are different objects in memory.");
        }
        if(str.equals(str3)) {
            System.out.println("str and str3 have the same content.");
        } else {
            System.out.println("str and str3 have different content.");
        }
    }
    /* 
    Explanation:
    This code demonstrates the difference between string interning and object creation in Java.
    When you create a string using string literals (like str and str2), they are stored in the string pool(intern pool).
    When you create a string using the 'new' keyword (like str3 and str4), they are stored in the heap memory.
    Interning is a process where the JVM stores only one copy of each distinct string value, which helps save memory.
    When you create a string using string literals, the JVM checks if that string already exists
    in the string pool. If it does, it returns a reference to that existing string. If not, it creates a new string
    in the pool. This is why str and str2 refer to the same object in memory, while str3 and str4 do not.
    Using '==' checks if both references point to the same object in memory, while '.equals()' checks if the values of the strings are the same.
    This is why str.equals(str2) returns true, while str3.equals(str4) also returns true, even though str3 and str4 are different objects in memory.
    Understanding this difference is crucial for correctly comparing strings in Java.
    */
}
