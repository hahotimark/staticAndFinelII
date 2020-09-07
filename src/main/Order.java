package main;

import java.util.Arrays;

public class Order {

    static final String WORD = "V";

    // -> itt most ezt hogy tudom neki átídni?

   protected static void orderChars(String WORD){


       char[] chars = WORD.toCharArray();
       Arrays.sort(chars);
       String sorted = new String(chars);
       System.out.println(sorted);

    }

}
