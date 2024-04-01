package com.itheima;

public class Test7 {
    public static void main(String[] args) {
        //目标：完成找素数
        System.out.println("当前素数的个数是：" + search(101, 200));
    }
    public static int search(int start,int end){
        int count = 0;
    //start = 101,end = 200
        //1.定义一个for循环，找到101到200之间的每个数据
        for (int i = start; i <= end; i++) {
            //  i  =  101  102  103....199  200

            //信号位思想
            boolean flag = true;//假设的意思，默认认为当前i记住的数据是素数

            //2.判断当前i记住的这个数据是否是素数
            for (int j = 2; j <= i / 2 ; j++) {
                if (i % j == 0){
                    //i当前记住的这个数据不是素数了
                    flag = false;
                    break;
                }
            }
            //3.根据判定的结果，决定是否输出i当前记住的数据，是素数才输出展示
            if (flag){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
