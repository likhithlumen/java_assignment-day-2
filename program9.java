//Reverse words in a string
import java
public class program9 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        StringBuffer stringBuffer = new StringBuffer(str);
        String reversedString = stringBuffer.reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }
}

