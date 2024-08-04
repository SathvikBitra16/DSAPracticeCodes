package GfG;

import java.util.ArrayList;

public class RecursiveFact {

	public static void main(String[] args) {
		System.out.println(factorialNumbers(3));

	}
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> l = new ArrayList<Long>();
        for(long i=1;i<=n;i++){
            long j = fact(i);
            if(j<=n){
                l.add(j);
            }
            else{
                break;
            }
        }
        return l;
        
    }
    static long fact(long n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}