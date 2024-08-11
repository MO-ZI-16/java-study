package com.wuhuuiniversity.demo1;
//当"字符+字符"或"字符+数字",会把字符通过ASSIC码表找到对应数字
public class ArithmeticoperatprDemo2 {
    public static void main(String[] args) {
        char c='a';
        int result = c+0;
        System.out.println(result);//97
        System.out.println(1+'a');//98
        System.out.println('a'+"abc");//"aabc"

        int a = 10;
        int b = 20;
        a += b;
        //a=(int)(a+b)
        System.out.println(a);

        //细节:
        //+= -= *= /= %= 底层都隐藏了一个强制类型转换
        short s = 1;
        //把左边和右边进行相加,得到结果2,再赋值给左边的变量
        s+=1;
        //等同于:s =(short) (s + 1);

    }

}
