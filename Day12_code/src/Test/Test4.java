package Test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        //生成随机数
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
         int count = 0;
        //判断两个数字给出的不同提示
        while(true){
            System.out.println("number");
            int guessNum = sc.nextInt();
            count++;
            if(count == 3){
                System.out.println("z");
                break;
            }
            if(guessNum > number){
                System.out.println("big");
            }else if(guessNum < number){
                System.out.println("small");
            }else{
                System.out.println("z");
                break;
            }
        }

/*
        //用来生成任意数到任意数之间的随机数 7~15
        Random r = new Random();
        int number = r.nextInt(9) + 7;//7~15
        System.out.println(number);
*/


    }
}
