package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入会员级别");
        int VIP = sc.nextInt();
        if(VIP == 1){
            System.out.println("实际支付"+(price*0.9));
        }else if(VIP == 2){
            System.out.println("实际支付"+(price*0.8));
        }else if(VIP == 3){
            System.out.println("实际支付"+(price*0.7));
        }else{
            System.out.println("实际支付"+price);
        }

    }
}
