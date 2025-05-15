//Develop a java program for performing various string operations with different string
//handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()

package advance;

public class StringFunctionsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'HELLO': " + str1.equalsIgnoreCase("HELLO"));

        // 4. String Searching
        String sentence = "Java is powerful and flexible";
        System.out.println("Sentence contains 'power': " + sentence.contains("power"));
        System.out.println("Index of 'flexible': " + sentence.indexOf("flexible"));

        // 5. Substring Operations
        String sub = sentence.substring(8, 16);
        System.out.println("Substring (8-16): " + sub);

        // 6. String Modification
        String modified = sentence.replace("Java", "Python");
        System.out.println("Modified sentence: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   Trim Me   ";
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("After trim(): '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String items = "Apple,Banana,Orange";
        String[] parts = items.split(",");
        System.out.println("Split result:");
        for (String item : parts) {
            System.out.println("- " + item);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        sb.insert(4, " - ");
        sb.replace(0, 4, "My");
        sb.deleteCharAt(2);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 21;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "student@aiet.edu";
        System.out.println("Validating email: " + email);
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}

