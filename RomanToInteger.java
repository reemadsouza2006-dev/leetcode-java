
class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int value = 0;

            if (s.charAt(i) == 'I') {
                value = 1;
            } else if (s.charAt(i) == 'V') {
                value = 5;
            } else if (s.charAt(i) == 'X') {
                value = 10;
            } else if (s.charAt(i) == 'L') {
                value = 50;
            } else if (s.charAt(i) == 'C') {
                value = 100;
            } else if (s.charAt(i) == 'D') {
                value = 500;
            } else if (s.charAt(i) == 'M') {
                value = 1000;
            }

            if (i + 1 < s.length() &&
                value < getValue(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }

    public int getValue(char ch) {

        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;

        return 0;
    }
}