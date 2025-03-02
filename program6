//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class program6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "lambda");
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        List<String> upperCaseStrings = new ArrayList<>();
        List<String> lowerCaseStrings = new ArrayList<>();

        strings.forEach(s -> upperCaseStrings.add(toUpperCase.apply(s)));
        strings.forEach(s -> lowerCaseStrings.add(toLowerCase.apply(s)));

        System.out.println("Uppercase: " + upperCaseStrings);
        System.out.println("Lowercase: " + lowerCaseStrings);
    }
}
