package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator.div(5,4);
        Calculator.sum(80, 2);

        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(50);
        list.add(5);
        list.add(19);
        list.add(34);
        Numbers.number((ArrayList<Integer>) list);

        Order.orderChars("vajonhányközhelyetbírmégelarakpart");

        /*
        Itt hogy tudnám úgy megcsinálni hogy az ékezeteket is megfelelő sorrendbe tegye?
         */


    }



}

/*
8. feladat: Mivel a Go metódus private ezért, másik osztály (Main) nem férhet hozá, így nem fut le.
 */
