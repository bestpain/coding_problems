package DSA;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringOptimized("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            Set<Character> seen = new HashSet<>();
            int counter = 1;
            seen.add((c));
            for (int j = i + 1; j < input.length(); j++) {
                char next = input.charAt(j);
                if (seen.contains(next)) break;
                else {
                    seen.add(next);
                    counter++;
                }
            }
            if (counter > count) count = counter;
        }
        return count;
    }

    public static int lengthOfLongestSubstringOptimized(String input) {
        int left = 0;
        Set<Character> seen = new HashSet<>();
        int maxLength = 0;
        for (int right = 0; right < input.length(); right++) {
            char currChar = input.charAt(right);

            while (seen.contains(currChar)) {
                seen.remove(input.charAt(left));
                left++;
            }
            seen.add(currChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
