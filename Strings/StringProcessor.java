import java.util.*;

public class StringProcessor {  // Renamed class to avoid conflict
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder();

        // Convert first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {  // Start from index 1
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');  // Append the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));  // Uppercase next character
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am shraddha";
        System.out.println(toUppercase(str));  // Output: "Hi I Am Shraddha"
    }
}
