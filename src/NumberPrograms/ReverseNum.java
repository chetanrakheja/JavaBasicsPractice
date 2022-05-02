package NumberPrograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]){

        System.out.println("Reverse of Num is " + reverseNum(takeNumInput()) );;


    }

    public static int takeNumInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        return sc.nextInt();
    }

//    number = 1234
//    remainder = 1234 % 10 = 4
//    reverse = 0 * 10 + 4 = 0 + 4 = 4
//    number = 1234 / 10 = 123
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
