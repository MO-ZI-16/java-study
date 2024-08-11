package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        /*需求:
        * */
        //1.键盘录入两个整数表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服的时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的衣服的时髦度");
        int girlFashion = sc.nextInt();

        //对比
        boolean result = myFashion > girlFashion;

        //打印最后结果
        System.out.println(result);
    }

}
