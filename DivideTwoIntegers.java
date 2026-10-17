
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long result = 0;

        while (a >= b) {
            long value = b;
            long count = 1;

            while (a >= value + value) {
                value = value + value;
                count = count + count;
            }

            a = a - value;
            result = result + count;
        }

        if ((dividend < 0 && divisor > 0) ||
            (dividend > 0 && divisor < 0)) {
            result = -result;
        }

        return (int) result;
    }
}
