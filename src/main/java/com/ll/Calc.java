package com.ll;

public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) return 0;

        final boolean isPlus = exp.contains("+");
        final boolean isMinus = !isPlus;


        final String divideSign = isPlus ? "\\+" : "-";

        String[] expBits = exp.split(" ");
        final String sign = expBits[1];


        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[2]);

        final int rs = switch (sign) {
            case "+":
                yield num1 + num2;
            case "-":
                yield num1 - num2;
            case "*":
                yield num1 * num2;
            default:
                yield num1 / num2;
        };
        return rs;

    }
}
