package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){

        //分析
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("录入整数");
        int week = sc.nextInt();
       /* switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("无");
                break;*/
        switch (week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("无");
        }
    }
}
