package com.hackerrank.stocktrades;

import java.util.*;
public class PirateTalk
{
    public static void main(String... arrrrrgs) {
        Properties p = System.getProperties();
        p.setProperty("pirate","scurvy");
        String s = p.getProperty("argProp") + " ";
        s += p.getProperty("pirate");
        System.out.println(s);
    }
}// /* This is a // // comment */
// /* This is also a comment // More comments */
// /* This is also a comment /* More comments */ */
// /* Here is a comment **** */