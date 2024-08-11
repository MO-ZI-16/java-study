package com.wuhuuiniversity.demo1;
//1.当"+"操作中出现字符串是,这个"+"是字符串连接符,而不是算术运算符了
//"123"+123 --> "123123"
//连续进行"+"操作时,从左到右逐个执行
public class ArithmeticoperatprDemo1 {
    public static void main(String[] args) {

        System.out.println(3.7+"abc");
        int age = 18;
        System.out.println("我的年龄是"+age+"岁");//我的年龄是18岁
        System.out.println(1+2+"haha"+1+2);//3haha12
    }

}
