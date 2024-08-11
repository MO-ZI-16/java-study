package Logicaloperator;

public class LogicaloperatorDeom1 {
    public static void main(String[] args){
        //1.&
        //两边都为真,结果才是真
        System.out.println(true & true);//true
        System.out.println(false & true);//false
        System.out.println(false & false);//false

        //2.| 或者
        System.out.println(true | true);//true
        System.out.println(false | true);//true
        System.out.println(false | false);//false

        //3.^ 异或
        //相同为false,不同为true

        System.out.println(true ^ true);//false
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false

        //4.! 逻辑非
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}
