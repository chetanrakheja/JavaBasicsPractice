package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check if prime");
        int num = sc.nextInt();
        boolean isPrime=true;

//        if(num==1||num==2){
//            isPrime=true;
//        }

        for (int i=2;i<num/2;i++){
            System.out.println("Comparing Number with "+i);
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not a prime number");
        }



    }


}
