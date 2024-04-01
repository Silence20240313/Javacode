package com.itheima;

import static java.util.Collections.reverse;


public class Test4 {
    public static void main(String[] args) {
        //目标：完成数字加密程序的开发
        System.out.println("加密后的结果是:"+encrypt(1983));
    }

    public static String encrypt(int number){
        //number =1983
        //1.把这个密码拆分成一个一个的数字，才可以对其进行加密
        int[] numbers = split(number);
        //numbers = {1,9,8,3}

        //2.遍历这个数组中的每个数字，对其进行加密处理
        for (int i = 0; i < numbers.length; i++) {
            //i =0 1 2 3
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //numbers = [6 4 3 8]

        //3.对数组反转，把对数组进行反转的操作交给一个独立的方法来完成
        reverse(numbers);
        //numbers = [8 3 4 6]

        //4.把这些加密的数字拼接起来做为加密后的结果返回即可
        String date = "";
        for (int i = 0; i < numbers.length; i++) {
            date += numbers[i];
        }
        return date;
    }

    public static void reverse(int[] numbers) {
        //反转数组的
        //numbers = [6 4 3 8]
        //           i      j
        for (int i = 0, j = numbers.length - 1; i < j; i++,j--) {
            //交换i和j位置处的值
            //1.把后一个位置处的值交给一个临时变量先存起来，
            int temp = numbers[j];
            //2.把前一个位置处的值赋值给后一个位置处
            numbers[j] = numbers[i];
            //3.把后一个位置处原来的值（由临时变量记住着）赋值给前一个位置
            numbers[i] = temp;
        }
    }

    public static int[] split(int number) {
        //number = 1983
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }
}
