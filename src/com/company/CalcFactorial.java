package com.company;

import java.math.BigInteger;

/**
 * Created by 张连芳 on 2016/10/19.
 */
public class CalcFactorial {
    public static String subResult(int input, int start, int end) {
        return result(input).substring(start, end);
    }

    public static String result(int input) {
        //输入任意一个数字，可以输出相应的结果（输入1000，返回1000！）

        BigInteger sum = new BigInteger("1");
        for (int i = input; i > 0; i--) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        return sum.toString();
    }
}
