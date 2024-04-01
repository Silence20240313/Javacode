package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚使用变量的几点注意事项
        //1.变量要先声明才能使用
        int age=18;
        System.out.println(age);

        //2.变量是什么类型，就应该用来装什么类型的数据，否则报错
        //age=9.8;

        //3.变量是从定义开始到"}"截止的范围内有效，且同一个范围内，定义的多个变量，他们的名称不能一样
        {
            int a=19;
            //int a=23;
            System.out.println(a);
        }
        //System.out.println(a);
        System.out.println(age);
        int a=23;
        //int age=25;

        //4.变量定义的时候可以不赋初始值，但在使用时，变量里必须有值，否则报错
        int number;
        number=100;
        System.out.println(number);

    }
}
