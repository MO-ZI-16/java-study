package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int number = sc.nextInt();

        //表示最初就认为number是一个质数
        boolean flag = true;

        int i = 0;
        for(i = 2; i < number; i++){
            if(number % i == 0){
               flag = false;
                break;
            }/* else{

            }*/
        }
        //只有当这个循环结束了,表示这个范围之内的所有数字都判断完了
        //此时才能断定number是一个质数
        if(flag){
            System.out.println(number + "yes");
        }else{
            System.out.println(number + "no");
        }
    }
}
