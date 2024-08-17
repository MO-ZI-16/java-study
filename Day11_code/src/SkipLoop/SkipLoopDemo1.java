package SkipLoop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
       /* for(int i = 0; i < 5; i++) {
            if(i==3){
                //continue结束本次循环,继续下次循环
                continue;
            }
            System.out.println("xia"+i+"ban");*/
        for(int i = 0; i < 5; i++) {
            if(i==3){
                //break结束整个循环
              break;
            }
            System.out.println("xia"+i+"ban");
        }
    }
}
