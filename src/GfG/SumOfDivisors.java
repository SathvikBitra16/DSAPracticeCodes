package GfG;

class SumOfDivisirs{
    static Long sumOfDivisors(int N){
        // code here
        Long sum = 0L;
        for(int i=1;i<=N;i++){
            sum += i*(N/i);
        }
        return sum;
    }
}