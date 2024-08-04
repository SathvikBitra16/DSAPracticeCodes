package GfG;

class Erercise1{
    static int evenlyDivides(int N){
        // code here
        int count = 0;
        int a = N;
        while(N>0){
            int rem = N%10;
            if(rem != 0){
                if(a%rem == 0){
                count += 1;   
                }   
            }
            N /=10;
        }
        return count;
    }
}