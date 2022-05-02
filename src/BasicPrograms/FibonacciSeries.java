package BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {
//    Program to Print  Fibonacci Series




    private void printFibSeries(int arraySize){
        int firstNum=0;
        int secondNum=1;
        int tempSum,i;
//        int fibSerSize=takeUserInput();

        int fibSeries[] = new int[arraySize];

        for (i=0;i<arraySize;i++){
            if(i==0){
                fibSeries[i]=firstNum;
            }else if(i==1){
                fibSeries[i]=secondNum;
            }else {
                tempSum=firstNum+secondNum;
                firstNum=secondNum;
                secondNum=tempSum;
                fibSeries[i]=tempSum;
            }
        }
        printArray(fibSeries);
    }

    private int takeUserInput(){
    int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of elements in Fibnocci Services");
        n=sc.nextInt();
        return n;
    }

    private void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main (String args[]){
        FibonacciSeries FibProg = new FibonacciSeries();
        FibProg.printFibSeries(FibProg.takeUserInput());

    }
}
