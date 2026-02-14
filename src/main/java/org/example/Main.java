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
//        Problems testProblems = new Problems();
//
//       String result = testProblems.spinWords("Tests and no changes");
//        System.out.printf("Result: %s", result);
        List<Object> testList = new ArrayList<>();
        testList.add(123);
        testList.add("test");

        for(Object item : testList){
            System.out.println("Item: " + item);
            System.out.println("Item Class: " + item.getClass());
        }


    }
}