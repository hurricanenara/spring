package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static int countFruit(String input) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int count = 0;
        for (String fruit : fruits) {
            System.out.println(fruit);
            if (fruit.equals((input))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = countFruit("수박");
        System.out.println(count);

/*
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");
        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(5));
        System.out.println(fruits.get(6));
        System.out.println(fruits.get(7));
        System.out.println(fruits.get(8));
        System.out.println(fruits.get(9));
        System.out.println(fruits.get(10));
        System.out.println(fruits.get(11));
        System.out.println(fruits.get(12));
*/

        /*
enhanced for
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i=0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }
*/

/*
        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");
*/

/*
        for (String celeb : celebs) {
            System.out.println(celeb);
        }
*/
/*
        for (int i = 0; i < celebs.size(); i++) {
            System.out.println(celebs.get(i));
        }
*/
/*
        int age = 20;
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
*/

    }
}

