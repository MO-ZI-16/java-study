package switchDemo;
//case 穿透
//就是语句体中没有写break导致
//执行流程
//首先会拿着小括号中的表达式的值跟下面每一个case进行匹配
//如果匹配上了,就会执行对应的语句体,如果此时发现了break,那么就结束整个switch语句

public class switchDemo1 {
    public static void main(String[] args){
        int number = 1;
        /*switch(number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;*/
        switch(number) {
            case 1 -> {
                System.out.println("1");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }


    }
}
