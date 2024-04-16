package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    /** 启动ATM系统 展示欢迎界面  */
    public void start(){
        while (true) {
            System.out.println("=========欢迎您进入到了ATM系统===========");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择:");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //用户登录
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");

            }
        }
    }

    /**完成用户开户操作  */
    private void createAccount(){
        System.out.println("=======系统开户操作========");
        //1.创建一个账户对象，用于封装用户的开户信息
        Account acc = new Account();

        //2.需要用户输入自己的开户信息，赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);//"男"
            if (sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else{
                System.out.println("您输入的性别有误，只能是男或者女");
            }
        }

        while (true) {
            System.out.println("请您输入您的账户密码:");
            String passWord = sc.next();
            System.out.println("请您输入您的确认密码:");
            String okpassWord = sc.next();
            //判断两次密码是否一样
            if (okpassWord.equals(passWord)){
                acc.setPassWord(okpassWord);
                break;
            }else{
                System.out.println("您输入的两次密码不一致，请确认");
            }
        }

        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //重点：我们需要为这个账户生成一个卡号（由系统自动生成，8位数字表示，不能与其他账户的卡号重复）

        //3.把这个账户对象存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜您：" + acc.getUserName() + "开户成功，您的卡号是：");
    }
}
