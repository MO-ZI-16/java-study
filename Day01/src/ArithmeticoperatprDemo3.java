/*
public class ArithmeticoperatprDemo3 {
    public static void main(String[] args){
        //键盘录入三位数,获取其中的个位,十位,百位

        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        //2.获取个位,十位,百位
        //公式
        //个位:数字%10
        //十位:数字/10%10
        //百位:数字 / 10 / 10 % 10
        int ge = number%10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
*/
//隐式转换:
//1.取值范围小的,和取值范围大的进行运算的时候,小的会提升为大的,
//2.byte short char 三种类型的数据在进行运算的时候,都会直接先提升为int,然后进行运算
//把一个取值范围小的数值,转成取值范围大的数据
//byte --> short--> int--> long--> float--> double(取值范围从小到大)
//int a

//强制转换:
//如果把一个取值范围大的数值,赋值给一个取值范围小的变量
//是不允许直接赋值的.如果一定要这么做就需要加入强制转换
//格式:目标数据类型 变量名=(目标数据类型)被强转的数据
public class ArithmeticoperatprDemo3 {
    public static void main(String[] args){
        byte b1=10;
        byte b2=10;
        //byte result=b1+b2;//这里会报错,因为b1和b2会被隐式转换成int类型
        byte result=(byte)(b1+b2);//不能写成(byte)b1和(byte)b2
        System.out.println(result);
    }
}
