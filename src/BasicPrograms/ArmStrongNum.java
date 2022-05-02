package BasicPrograms;

import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String args[]){

        int num=takeNumInput();
        if(checkArmStrong(num)){
            System.out.println("Number is an Armstrong number");
        }else {
            System.out.println("Number is NOT an Armstrong number");
        }
    }
    public static boolean checkArmStrong(int num){
        int numLength=getNumLength(num),result=0,remainder=0;
        int originalNum=num;
        while (num>0) {
            remainder=num%10;
            result= calcNumPow(remainder,numLength) +result;
            num = num / 10;
        }

        return result==originalNum;
    }

    public static int calcNumPow(int num,int pov){
        int result=1;
        for (int i = 0; i < pov; i++) {
            result=result*num;
        }
        return result;
    }

    public static int getNumLength(int num){
        int numLength=0;
        while (num>0) {
            num = num / 10;
            numLength++;
        }
        return numLength;
    }

    public static int takeNumInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        return sc.nextInt();
    }
}
