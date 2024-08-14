package switchDemo;
//switch语句格式
/*switch(表达式){
    case 数值1:
        语句体1;
        break;
    case 数值2:
        语句体1;
        break;
    default:
        语句体1;
        break;*/
public class switchDemo1 {
    public static void main(String[] args){
            //1.定义变量记录心中的面
        String noodles = "兰州拉面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "wuhan":
                System.out.println("wuhan");
                break;
            case "beijian":
                System.out.println("beijian");
                break;
            case "shanxi":
                System.out.println("shanxi");
                break;
            default:
                System.out.println("fangbianm");
                break;
        }
    }
}
