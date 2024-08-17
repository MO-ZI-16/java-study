package LoopTest;

public class LoopTest1 {
    public static void main(String[] args) {
        //分析
        //个位7,十位7,7倍数
       for(int i = 1; i <= 100; i++){
           if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
               System.out.println("guo");
           }
           System.out.println(i);
       }

    }
}
