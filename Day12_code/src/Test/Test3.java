package Test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //获取一个随机数
        Random r = new Random();

        //在小括号中,书写的是生成随机数的范围
        //这个范围一定是从0开始
        //
        int number = r.nextInt(10);//0~9
        System.out.println(number);
    }
}
