package com.itheima.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        //目标：掌握基本数据类型的使用
        //1.byte short int long
        byte a=127;//-128--127
       // byte a2=128;//越界了

         short s=13244;
         //short s1=93244;//越界了

        int i=422424;//默认

        //注意：随便写一个整型字面量默认是int类型的，424242244444虽然没有超过long的范围，但是超过了本身int类型的范围
        //如果希望随便写一个整型字面量默认是long类型的，需要在后面加上L/l
        long lg=424242244444L;

        //2.float doubie
        //注意：随便写小数字面量，默认是double,如果希望小数是float,后面加上F/f
        float f=3.14F;

        double d=56.45;

        //3.char 字符型
        char ch='a';
        char ch2='中';

        //4.boolean
        boolean flag=true;
        boolean flag2=false;

        //拓展一种引用数据类型，后面要用
        //String称之为字符串类型，定义的变量可以用于记住一个字符串数据
        String name="张三";
        System.out.println(name);
    }
}
