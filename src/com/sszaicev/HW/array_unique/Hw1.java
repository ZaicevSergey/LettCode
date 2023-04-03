package com.sszaicev.HW.array_unique;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println(letters_learned_today("AAAAAAAAAAAAAAAAAAAA"));

    }

    public static String letters_learned_today(String str) {
        char[] charsSrt = str.toCharArray();
        List<Character> uniqueCharacters = new ArrayList();

        for (char charString : charsSrt){
            boolean flag = false;
            for ( Character uniqueChar : uniqueCharacters){
                if (charString == uniqueChar){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                uniqueCharacters.add(charString);
            }
        }
        return  uniqueCharacters.toString();
    }
}
