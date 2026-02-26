package com.example;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }
    public static int add(String x) {
        if(x == null || x.trim().split(",").length <= 1 ){
            return 0;
        }

        String[] arrx = x.split(",");
        int total = 0;
  
        for(int i = 0; i < arrx.length; i++) {
            total += Integer.parseInt(arrx[i]);
        }
  
        return total;
    }

}

