package com.example;

import java.util.Arrays;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int times(int[] values) {
        int total = 1;

        for (int value : values) {
            total *= value;
        }

        return total;
    }

    public int remainder(int x, int y) {
        return x % y;
    }
   public int divide(int x, int y) {
       return x/y;
   }
}
