package com.ion.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Task1{
    private static Stack stk =  new Stack(100);

    private static boolean goodBracketsExpression(String exp){
        for(int i = 0; i < exp.length(); i++) {
            switch(exp.charAt(i)){
                case '(':
                    stk.addElement('(');
                    break;

                case ')':
                    if(stk.getTopElement() == '('){
                        stk.popTop();
                    }
                    break;

                case '[':
                    stk.addElement('[');
                    break;

                case ']':
                    if(stk.getTopElement() == '['){
                        stk.popTop();
                    }
                    break;

                case '{':
                    stk.addElement('{');
                    break;

                case '}':
                    if(stk.getTopElement() == '}'){
                        stk.popTop();
                    }
                    break;
            }
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File(
                "/home/ion/Documents/Sem(III)/OOP/Homework/OOP_Labs/src/com/ion/lab4/task1/inFile.txt"
        );
        Scanner scanner = new Scanner(inFile);

        try {
            scanner = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scanner.hasNext()){
            String expression = scanner.nextLine();
            System.out.println(goodBracketsExpression(expression));
        }
    }

}
