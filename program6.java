//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface StringOperation {
    String apply(String s);
}

public class program6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "lambda");

        
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        
        List<String> upperCaseStrings = new ArrayList<>();
        List<String> lowerCaseStrings = new ArrayList<>();

        strings.forEach(s -> upperCaseStrings.add(toUpperCase.apply(s)));
        strings.forEach(s -> lowerCaseStrings.add(toLowerCase.apply(s)));

      
        System.out.println("Uppercase: " + upperCaseStrings);
        System.out.println("Lowercase: " + lowerCaseStrings);
    }
}
