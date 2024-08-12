package Test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args)
    {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();

        //2.a==6 || b==6  || (a+b)%6==0
        //满足其中一个就可以了
        boolean result = number1 == 6 || number2 == 6 || (number2+number1)%6==0;

        System.out.println(result);

    }
}
