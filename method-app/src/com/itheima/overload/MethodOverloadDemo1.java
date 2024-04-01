package com.itheima.overload;

public class MethodOverloadDemo1 {
    public static void main(String[] args) {
        //目标：认识方法重载，并掌握其应用场景
        test();
        test(100);
    }

    public static void test(){
        System.out.println("============test1=========");
    }

    public static void test(int a){
        System.out.println("=========test2==========="+a);
    }

    void test(double a){
    }

    void test(double a,int b){
    }

    void test1(int b,double a){
    }

    void test2(int a,double b){
    }

    int test(int a,int b){
        return a + b;
    }
}
