package arrayDemo;

public class arrayDemo4 {
    public static void main(String[] args) {
        int i = 0;

        //格式
        //数据类型[] 数组名 = new 数据类型[数组长度];
        //在创建的时候

        String[] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "list";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //字符类型:默认初始化值为'\u0000'
        //布尔类型:默认初始化值为false
        //引用数据类型:默认初始化值为NULL
    }
}
