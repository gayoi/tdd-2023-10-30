package com.ll;

public class Calc {
    public static int run(String exp) {
        if(exp.isBlank()){return 0;}
        if(exp.contains("-")){
            return 0;
        }
        //ex
        String[] exps = exp.split("\\+");

        int num1 = Integer.parseInt(exps[0]);
        int num2 = Integer.parseInt(exps[1]);

        return num1 + num2;

//        if(exp.contains("10+20")){
//            return 30;
//        }
//        if(exp.contains("10+30")){
//            return 40;
//        }
//        if(exp.contains("10+40")){
//            return 50;
//        }
    }
}
