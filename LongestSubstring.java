class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            String current = "";

            for (int j = i; j < s.length(); j++) {

                if (current.contains(String.valueOf(s.charAt(j)))) {
                    break;
                }

                current += s.charAt(j);

                if (current.length() > max) {
                    max = current.length();
                }
            }
        }

        return max;
    }
}