package GfG;

class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }

    static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}