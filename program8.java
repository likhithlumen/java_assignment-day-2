//Find Longest Common Prefix using Sorting

import java.util.Arrays;

public class program8 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        if (strs == null || strs.length == 0) {
            System.out.println("Longest Common Prefix: ");
            return;
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        String longestCommonPrefix = first.substring(0, i);
        System.out.println("Longest Common Prefix: " + longestCommonPrefix);
    }
}
