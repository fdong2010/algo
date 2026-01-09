import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (charIndexMap.containsKey(currChar) && charIndexMap.get(currChar) >= start) {
                start = charIndexMap.get(currChar) + 1;
            }
            charIndexMap.put(currChar, i);
            maxLength = Math.max(maxLength, i - start + 1); 
        }
        return maxLength;
    }
}
