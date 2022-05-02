package BasicPrograms;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String args[]){

        int num=takeNumInput();
        System.out.println("Factorial of "+num + " = " + calcFactRec(num));

    }

    public static int calcFact(int num){
        System.out.println("Using calc Fact Fun");
        int result=1;
        for (int i=num;i>0;i--){
            result=result*i;

        }
        return result;
    }

    public static int calcFactRec(int num){
        System.out.println("Using calc Fact Rec Fun");
        if(num==1||num==0){
            return 1;
        }
        return num * calcFactRec(num-1);
    }



    public static int takeNumInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        return sc.nextInt();
    }
}
