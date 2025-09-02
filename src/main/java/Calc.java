package com.iwon;

import java.util.Arrays;

public class Calc {
    public static int run(String args) {
        if (args.length() == 0) return 0;

        String[] arr = args.split(" ");
        System.out.println(Arrays.toString(arr) + ":" + arr.length);

        String result = arr[0];
        int x = 0;

        for (int i = 0; i < arr.length - 2 ;) {
            result = operation(result, arr[i + 1], arr[i + 2]);
            x = Integer.parseInt(result);
            System.out.println("result = " + result + ", x=" + x);
            i += 2;
        }
//
//        if (arr.length == 3) {
//            result = operation(result, arr[1], arr[2]);
//            return Integer.parseInt(result);
//        }
//        else if (arr.length == 5) {
//            result = operation(result, arr[1], arr[2]);
//            result = operation(result, arr[3], arr[4]);
//
//            return Integer.parseInt(result);
//        }
//        else if (arr.length == 7) {
//            result = operation(result, arr[1], arr[2]);
//            result = operation(result, arr[3], arr[4]);
//            result = operation(result, arr[5], arr[6]);
//
//            return Integer.parseInt(result);
//        }
//        else if (arr.length == 13) {
//            result = operation(result, arr[1], arr[2]);
//            result = operation(result, arr[3], arr[4]);
//            result = operation(result, arr[5], arr[6]);
//            result = operation(result, arr[7], arr[8]);
//
//            return Integer.parseInt(result);
//        }

        return Integer.parseInt(result);
    }

    private static String operation(String num1, String symbol, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        switch(symbol) {
            case "+" :
                return String.valueOf(n1 + n2);
            case "-" :
                return String.valueOf(n1 - n2);
            case "*" :
                return String.valueOf(n1 * n2);
        }

        return "0";
    }
}
