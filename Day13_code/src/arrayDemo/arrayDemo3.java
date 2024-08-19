package arrayDemo;

public class arrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,6};

        System.out.println(arr[0]);
        for(int i = 0; i < 5; i++){
            //
            System.out.println(arr[i]);
        }

        //在java中,关于数组的长度属性:length
        //调用方式:数组名.length
        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
