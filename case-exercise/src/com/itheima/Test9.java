package com.itheima;

/**
       *
      ***
     *****
    *******

 本质：计算机本质只能打印行，所以按照行思考
先找规律，再写程序
 行 --i     先打空格(n-i)    再打星星(2i-1)    换行
 1           3               1
 2           2               3
 3           1               5
 4           0               7

 */
public class Test9 {
    public static void main(String[] args) {
       //1.先定义一个循环，控制打印多少行
        int n = 4;
        for (int i = 1; i <= n; i++) {
             //2.控制打印多少个空格
            for (int j = 1; j <= (n - i)  ; j++) {
                System.out.print(" ");
            }

            //3.控制打印多少个星星
            for (int j = 1; j <= (2*i - 1) ; j++) {
                System.out.print("*");
            }
            //4.换行
            System.out.println();
        }
    }
}
