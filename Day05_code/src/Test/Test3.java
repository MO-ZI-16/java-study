package Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("shfuaf");
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跑步");

                break;
            case 2:
                System.out.println("师范大");
                break;
            case 3:
                System.out.println("阿第三方");
                break;
            case 4:
                System.out.println("算法");
                break;
            case 5:
                System.out.println("啊四方达");
                break;
            case 6:
                System.out.println("阿范德萨");
                break;
            case 7:
                System.out.println("艾弗森");
                break;
            default:
                System.out.println("没有");
                break;
        }
    }
}
