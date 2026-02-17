package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Problems testProblems = new Problems();
//
//       String result = testProblems.pigIt("O tempora o mores !");
//        System.out.printf("Result: %s\n", result);
        int activeCount = 0;
        int number = 5;
        String bitString = Integer.toBinaryString(number);
        char[] bits = bitString.toCharArray();
        for(char bit : bits){
            System.out.println("bit: " + bit);
            if(bit == '1'){
                activeCount++;
            }
        }
    }
}