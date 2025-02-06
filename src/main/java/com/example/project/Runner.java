package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Runner{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,2,3);
        System.out.println(Main.notAlone(list,2));
        list.clear();
        Collections.addAll(list, 3,4);
        System.out.println(Main.notAlone(list,3));
        list.clear();
        Collections.addAll(list, 4,3,4,4);
        System.out.println(Main.notAlone(list,4));
    }
}