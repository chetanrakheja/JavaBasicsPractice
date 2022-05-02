package CompetativeSites;

import java.util.HashMap;
import java.util.Map;

public class RomanNumToInt {

    public static int romanToInt(String s) {
        // Write your code here
        int numResult=0;

        Map<String , Integer> romanValues = new HashMap<String, Integer>();
        romanValues.put("I",1);
        romanValues.put("V",5);
        romanValues.put("X",10);
        romanValues.put("L",50);
        romanValues.put("C",100);
        romanValues.put("D",500);
        romanValues.put("M",1000);

        for (int i = 0; i < s.length(); i++) {
            if(i<s.length()-1) {
                if (romanValues.get("" + s.charAt(i))
                        < romanValues.get("" + s.charAt(i + 1))) {
                    numResult = numResult - romanValues.get("" + s.charAt(i));
                    i++;
                }
            }
                numResult= numResult+romanValues.get(""+s.charAt(i));
        }

        return numResult;
    }



    public static void main(String args[]){

        System.out.println(romanToInt("III"));
    }


}
