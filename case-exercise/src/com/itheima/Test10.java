package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //目标：完成双色球系统的开发
        int[] userNumbers = userSeleceNumber();
        System.out.println("您投注的号码：");
        printArray(userNumbers);

        int[] LuckNumbers = createLuckNumbers();
        System.out.println("中奖的号码：");
        printArray(LuckNumbers);

        judge(userNumbers, LuckNumbers);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    /**
     * 1.设计一个方法，用于让客户投注一组号码并返回（前6个是红球号码，最后一个是篮球号码）
     */
    public static int[] userSeleceNumber() {
        //2.创建一个整型数组，用于存储用户投注的7个号码（前6个是红球号码，最后一个是篮球号码）
        int[] numbers = new int[7];
        //numbers = {0,0,0,0,0,0,0}
        //           0 1 2 3 4 5 6

        Scanner sc = new Scanner(System.in);
        //3.遍历前6个位置，让用户依次投注6个红球号码，存入
        for (int i = 0; i < numbers.length - 1; i++) {
            // i =0 1 2 3 4 5

            while (true) {
                //4.开始让用户为当前位置投注一个红球号码（1-33之间，不能重复）
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33之间，不能重复）,");
                int number = sc.nextInt();

                //5.先判断用户输入的红球号码是否在1-33之间
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您输入的红球号码不在1-33之间，请确认！");
                } else {
                    //号码是在1-33之间了，接着还要继续判断这个号码是否重复了，不重复才可以使用
                    if (exist(numbers, number)) {
                        //number当前这个红球号码是重复了
                        System.out.println("对不起，您当前输入的红球号码前面选择过，重复了，请确认!");
                    } else {
                        //number记住的这个号码没有重复了，就可以使用了
                        numbers[i] = number;
                        break;//结束当次投注，结束了当前死循环
                    }
                }
            }
        }

        //6.投注最后一个篮球号码
        while (true) {
            System.out.println("请您输入最后一个蓝球号码(1-16),");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您输入的篮球号码范围不对");
            } else {
                numbers[6] = number;
                break;//篮球号码录入成功，结束死循环
            }
        }

        return numbers;
    }

    public static boolean exist(int[] numbers, int number) {
        //需求：判断number这个数字是否在numbers数组中存在
        //numbers = {12 25 18 0 0 0 0 };
        //number = 25
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                break;
            }
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    //2.设计一个方法，随机一组中奖号码出来（6个红球号码 1个篮球号码）
    public static int[] createLuckNumbers() {
        //1.创建一个整型数组，用于存储这7个号码，
        int[] numbers = new int[7];

        Random r = new Random();
        //2.遍历前6个位置处，依次随机一个红球号码存入（1-33 不重复）
        for (int i = 0; i < numbers.length - 1; i++) {
            //i = 0 1 2 3 4 5

            while (true) {
                //3.为当前这个位置随机一个红球号码出来存入   1-33  >>>   -1   >>>   (0-32)+1
                int number = r.nextInt(33) + 1;

                //4.判断这个号码是否之前出现过（红球号码不能重复）
                if (!exist(numbers, number)) {
                    //number不重复
                    numbers[i] = number;
                    break;//结束死循环，代表找到了当前这个位置的一个不重复的红球号码了
                }
            }
        }

        //3.录入一个篮球号码   1-16
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    //3.设计一个方法，用于判断用户的中奖情况
    public static void judge(int[] userNumbers, int[] LuckNumbers) {
        //userNumbers = [12 14 16 18 23 26 8]
        //LuckNumbers = [16 17 18 19 26 32 8]

        //2.分别定义两个变量用于记住红球命中了几个以及篮球命中了几个
        int redCount = 0;
        int blueCount = 0;

        //先判断红球命中的数量
        //遍历用户投注的号码的前6个红球
        for (int i = 0; i < userNumbers.length - 1; i++) {
            //userNumbers[i]
            //开始遍历中奖号码的前6个红球号码，看用户当前选择的这个号码是否命中了
            for (int j = 0; j < LuckNumbers.length - 1; j++) {
                if (userNumbers[i] == LuckNumbers[j]) {
                    redCount++;
                    break;
                }
            }
        }

        //3.判断篮球是否命中了
        blueCount = userNumbers[6] == LuckNumbers[6] ? 1 : 0;

        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的篮球数量是：" + blueCount);

        //4.判断中奖详情，并输出结果
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜您，中奖1000万，可以开始享受人生了");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜您，中奖500万，可以稍微开始享受人生了");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜您，中奖3000元，可以出去吃顿小龙虾了");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1) {
            System.out.println("恭喜您，中了小奖：200元了");
        } else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1) {
            System.out.println("中了10元");
        } else if (redCount < 3 && blueCount == 1) {
            System.out.println("中了5元");
        } else {
            System.out.println("感谢您对福利事业做出的巨大贡献");
        }
    }
}