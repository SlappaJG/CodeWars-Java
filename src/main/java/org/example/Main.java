package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Problems testProblems = new Problems();

       String result = testProblems.spinWords("Tests and no changes");
        System.out.printf("Result: %s", result);
    }
}