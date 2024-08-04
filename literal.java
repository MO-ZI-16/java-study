/
public class literal {
    public static void main(String[] args) {
        //

        //整数
        System.out.println(666);
        System.out.println(-777);

        //小数
        System.out.println(0.98);
        System.out.println(-0.38);

        //字符串
        System.out.println("黑马");
        //字符
        System.out.println('我');
        //布尔
        System.out.println(true);
        System.out.println(false);
        //空
        //null不能直接打印,只能以字符串的形式打印
        System.out.println("null");

    }
}


//'\t'-制表符,在打印的时候,把前面的字符串补齐到8,或者8的整数倍.最少补一个空格,最多补8个空格
public class literal {
    public static void main(String[] args) {
        //制表符'\t'

        System.out.println("name"+'\t'+"age");
        System.out.println("gc"+'\t'+"18");
    }
}