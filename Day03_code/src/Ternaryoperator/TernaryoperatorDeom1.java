package Ternaryoperator;

//三元运算符
//格式:关系表达式 ? 表达式1 : 表达式2
//如果关系表达式为真,那么就执行表达式1;如果为假,就执行表达式2
public class TernaryoperatorDeom1 {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 12;

        //2.使用三元运算符获取两个整数的较大值
        int c = a < b ? a:b;
        System.out.println(c);
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("第一只老虎体重");
        int weight1 = sc.nextInt();
        System.out.println("第二只老虎体重");
        int weight2 = sc.nextInt();
        String result = weight2 == weight1 ? "相同":"不同";
        System.out.println(result);
        */

        //定义三个和尚的身高的变量
        int height1 = 150;
        int height2 = 210;
        int height3 = 350;

        int tmp = height1 > height2 ? height1 : height2;
        int result = tmp > height3 ? tmp : height3;
        //ctrl + alt
        System.out.println(result);

    }
}
