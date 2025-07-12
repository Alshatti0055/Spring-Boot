//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void addPerson() {
        Integer x = 0;
        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            int y = (Integer)var2.next();
            System.out.println(y);
        }

    }

    protected String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public String toString() {
        return "school.Student{fullName=\"" + this.fullName() + "\"}";
    }
}
