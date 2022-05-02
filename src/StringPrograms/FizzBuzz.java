package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

        public static List<String> fizzBuzz(int n) {
            String Output = "";
            List<String> result = new ArrayList<String>();
            boolean flag=true;

            for (int i = 1; i <= n; i++) {
                Output = "";
                flag=true;
                if (i % 3 == 0) {
                    Output = Output + "Fizz";
                    flag=false;
                }

                if (i % 5 == 0) {
                    Output = Output + "Buzz";
                    System.out.println(i + "Buzz");
                    flag=false;
                } else if(flag){
                    Output = String.valueOf(i);
                }
                result.add(Output);
            }
            return result;
        }

        public static void main(String args[]){
            List<String> result= fizzBuzz(15);
            printStringList(result);
        }

        public static void printStringList(List<String> list){
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }

}
