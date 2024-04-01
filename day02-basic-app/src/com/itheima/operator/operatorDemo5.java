package com.itheima.operator;

public class operatorDemo5 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
        //需求：要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8
        double size=6.8;
        int storage=16;
        //1.& 前后的条件的结果必须都是ture,它的结果才是ture
        boolean rs=size>=6.95&storage>=8;
        System.out.println(rs);

        //需求2：要求手机要么满足尺寸大于等于6.95，要么内存必须大于等于8
        //2.| 只要多个条件中有一个是ture,结果就是ture
        boolean rs2= size >= 6.95 | storage >= 8;
        System.out.println(rs2);

        //3.!取反的意思
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println(!(2>1));//false

        //4.^ 前后条件的结果相同时返回false,不同时返回true
        System.out.println(true^true);//false
        System.out.println(false^false);//false
        System.out.println(true^false);//true
        System.out.println(false^true);//true

        //5.&& 左边为false，右边不执行
        int i=10;
        int j=20;
        //System.out.println(i > 100 && ++j > 99);
        System.out.println(i > 100 & ++j > 99);
        System.out.println(j);

        //6.|| 左边是ture,右边就不执行
        int m=10;
        int n=30;
        //System.out.println(m>3||++n>40);
        System.out.println(m>3|++n>40);
        System.out.println(n);
    }
}
