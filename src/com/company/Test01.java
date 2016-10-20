package com.company;

/**
 * Created by 张连芳 on 2016/10/18.
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(CalcFactorial.result(1231));
        System.out.println(CalcFactorial.subResult(1231, 120,150 ));
    }
}

//String subResult (int input, int start, int end)输入数字，计算阶乘，输出start-end之间的结果
//输入1000，20，30 返回1000！的第20到30位
