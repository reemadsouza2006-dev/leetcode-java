
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] letters = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            String currentLetters = letters[digits.charAt(i) - '0'];
            List<String> newResult = new ArrayList<>();

            for (String combination : result) {
                for (int j = 0; j < currentLetters.length(); j++) {
                    newResult.add(combination + currentLetters.charAt(j));
                }
            }

            result = newResult;
        }

        return result;
    }
}
