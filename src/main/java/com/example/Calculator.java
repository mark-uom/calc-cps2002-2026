package com.example;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int[] average(int[] numbers){
        int total = 0;
        for(int i =0; i < numbers.length; i++){
            total = numbers[i] + total;
        }

        return total / numbers.length;
    }

}
