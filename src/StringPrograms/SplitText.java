package StringPrograms;

public class SplitText {

    public static void main(String args[]){
     String  text="text1,text2,text3";
     String resultArr[];

     resultArr=text.split(",");
        System.out.println("\n");
        printArr(resultArr);
    }

    public static void printArr(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }


}
