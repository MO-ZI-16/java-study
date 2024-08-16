package Test;

public class Test5 {
    public static void main(String[] args) {
        int x = 1213;
        int temp = x;
        int num = 0;
        //从右往左
        while(x != 0){
            //从右往左获取每一个数字
            int ge = x%10;
            //修改一下x记录的值
            x /= 10;
            //把获取到的数字拼接到最右边
            num = num*10 + ge;
            System.out.println(x);
        }
        System.out.println(num);
        System.out.println(num == temp);
/*
        int x = 1234;

        int shi = x / 10 % 10;
        int bai = x / 100 % 10;
        int qian = x / 1000;
        System.out.println(ge + shi + bai + qian);
*/
    }
}
