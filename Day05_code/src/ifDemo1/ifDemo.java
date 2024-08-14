package ifDemo1;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args){
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int score = sc.nextInt();

        //对异常数据进行判断校验
        if(score >0 && score<=100){
            if(score >= 95 && score <= 100){
                System.out.println("送自行车");
            } else if(score >= 90 && score <= 94){
                System.out.println("youlec");
            }else if(score >= 80 && score <= 89){
                System.out.println("变性精钢");
            }else{
                System.out.println("die");
            }
        }else{
            System.out.println("当前数据不合法");
        }
    }
}
