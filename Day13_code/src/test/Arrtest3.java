package test;

public class Arrtest3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        for(i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                //偶数变成1/2
                arr[i] = arr[i]/2;
            }else {
                //奇数,扩两倍
                arr[i] = arr[i]*2;
            }
        }
        //遍历数组
        //一个循环只做一件事
        for(i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
