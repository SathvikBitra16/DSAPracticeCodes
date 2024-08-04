package LeetCode;

import java.util.*;
class ArnstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        int sum = 0;
        int num1 = num;
        while(num>0){
            int rem = num%10;
            sum += Math.pow(rem,String.valueOf(num1).length());
            num /= 10;
        }
        if(num1 == sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}