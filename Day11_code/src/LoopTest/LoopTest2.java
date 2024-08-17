package LoopTest;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zhengshu");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            //用i*i
            if(i*i == num){
                System.out.println(i + "jiu" + num + "平方根的整数");
                //一旦找到就停止
                break;
            }else if(i * i > num){
                System.out.println((i-1) + "iu" + num + "平方根的整数");
                break;
            }
        }
    }
}
