package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    // 파라미터 X, 반환값 X
    public void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public int sum(num1, num2) {
        return num1 + num2;
    }

    public static void printInfo() {
        String title = "Software Developer";
        String name = "Nara";

        System.out.println(title);
        System.out.println(name);
    }

    public static void main(String[] args) {
        printInfo();
    }
}

