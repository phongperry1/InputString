
package com.mycompany.inputstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Manager {
    public boolean checkSquareNumber(int n) {
        if(Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }
    
    
    public void getNumber(String inputString) {
        HashMap<String, ArrayList<Integer>> hmn = new HashMap<>();
        String number = inputString.replaceAll("\\D+", ",");
        if(number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if(number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;
        
        ArrayList<Integer> liPerfectSquare = new ArrayList<>();
        ArrayList<Integer> liOdd = new ArrayList<>();
        ArrayList<Integer> liEven = new ArrayList<>();
        ArrayList<Integer> liAll = new ArrayList<>();
        for(int i = 0; i < lenNumber ; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if(numberCheck % 2 == 1) {
                liOdd.add(numberCheck);
            }
            if(numberCheck % 2 == 0) {
                liEven.add(numberCheck);
            }
            if(checkSquareNumber(numberCheck)) {
                liPerfectSquare.add(numberCheck);
            }
            liAll.add(numberCheck);
        }
        hmn.put("Perfect Square Numbers: ", liPerfectSquare);
        hmn.put("Odd Numbers: ", liOdd);
        hmn.put("Even Numbers", liEven);
        hmn.put("All Number: ", liAll);
        
        for (Map.Entry m : hmn.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
              
        
    }
    
    public void getCharacter(String inputString) {
        HashMap<String, String> hms = new HashMap<>();
        String uppercase = inputString.replaceAll("\\W[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("\\W", "");
        hms.put("Uppercase: ", uppercase);
        hms.put("Lowercase: ", lowercase);
        hms.put("Special: ", special);
        hms.put("All Character: ", allCharacter);
        for (Map.Entry m : hms.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
