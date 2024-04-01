package com.itheima;

public class Test7__2 {
    public static void main(String[] args) {
        //目标：完成找素数
        //1.定义一个for循环，找到101到200之间的每个数据
        int count = 0;

        OUT://为外部循环指定标签
        for (int i = 101; i <= 200; i++) {
            //  i  =  101  102  103....199  200

            //2.拦截判断该数是否是素数
            for (int j = 2; j <= i / 2 ; j++) {
                if (i % j == 0){
                    //这个数肯定不是素数，不能打印
                    continue OUT;//结束外部循环的当此执行
                }
            }

            count++;
            System.out.println(i);
        }
        System.out.println("个数是:" + count);
    }
}
