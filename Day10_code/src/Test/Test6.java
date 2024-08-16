package Test;

public class Test6 {
    public static void main(String[] args) {
        //被除数 / 除数 = 商...余数
        //被除数
        int divided = 10;
        //除数
        int divisor = 3;
        //
        int count = 0;
        //3.循环
        while(divided >= divisor){
           divided -= divisor;
           count++;
        }
        System.out.println(divided);
        System.out.println("商wei"+count);
    }
}
