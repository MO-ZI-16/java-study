package Test;

public class Test2 {
    public static void main(String[] args) {
        int i,sum = 0;
        for(i = 1; i < 100; i++){
            //累加求和(先判断再求和)
            if(i % 2 == 0) {
                sum += i;
            }
            System.out.println(i);
        }
        //打印sum
        System.out.println(sum);
    }
}
