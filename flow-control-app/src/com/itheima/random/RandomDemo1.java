package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标:掌握使用Random生成随机数的步骤
        //1.导包，
        //2.创建一个Random对象，用于生成随机数
        Random r =new Random();
        //调用Random提供的功能，nextInt得到随机数
        for (int i=1;i <= 28;i++) {
            int date =r.nextInt(10);//0--9
            System.out.println(date);
        }

        System.out.println("-----------------------------------");

        for (int i = 1;i <= 20;i++) {
            //生成1-10之间的随机数
            //1--10→-1→(0-9)+1
            int date2=r.nextInt(10)+1;
            System.out.println(date2);
        }

        System.out.println("---------------------------");

        for (int i =1;i <= 20;i++) {
            //3--17→-3→(0-14)+3
            int date3 =r.nextInt(15)+3;
            System.out.println(date3);
        }
    }
}
