package BasicPrograms;

import java.util.Scanner;

public class palindromeNumber {

    public static void main(String args[]){
        int num =takeNumInput();
        if(num==reverseNum(num)){
            System.out.println("Number is a Palindrome Number");
        }else {
            System.out.println("Number is NOT a Palindrome Number");}

    }

    public static int takeNumInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        return sc.nextInt();
    }

    public static int reverseNum(int num){
        int remainder=0,reverse=0;

        while (num>0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }

}
