package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Runner{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1, 3, 1, 4, 4, 3, 1);
        System.out.println(Main.fix34(list));
    }
}