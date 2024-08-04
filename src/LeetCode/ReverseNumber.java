package LeetCode;

class ReverseNumber {
    public int reverse(int x) {
       int n = Math.abs(x);
       int res = 0;
       while(n!=0){
        int rem = n%10;
        if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10)
            return 0;
        res = (res*10)+rem;
        n /= 10;
       }
        if(x<0){
            res *= -1;
        }
        return res;
    }
}