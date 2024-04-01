package com.itheima;

public class Test7__3 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200 ; i++) {
            //i =101 102 103 ...199 200
            //i遍历到的当前数据是否是素数，是则输出，不是则不输出
            if (check(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check(int data){
        for (int i = 2; i <= data / 2 ; i++) {
            if (data % i == 0){
                return false;//不是素数
            }
        }
        return true;//是素数
    }
}
