package Test;

public class Test4 {
    public static void main(String[] args) {
        //
        double i=0.1, count = 0, a = 0, height = 8844430;
        //选择while循环的理由
        while(i < height){
            i *= 2;
            count++;
        }
        //当循环结束之后
        System.out.println(count);
    }
}
