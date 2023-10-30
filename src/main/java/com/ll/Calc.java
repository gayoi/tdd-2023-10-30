package com.ll;

public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) return 0;

        final boolean isPlus = exp.contains("+");
        final boolean isMinus = !isPlus;


        final String divideSign = isPlus ? "\\+" : "-";

        String[] expBits = exp.split(" " + divideSign + " ");
        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);

        if(isPlus) return num1 + num2;
        else return num1 - num2;


    }
}
