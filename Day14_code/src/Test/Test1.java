package Test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,33,44};
        //临时认为0索引最大
        int max = arr[0];
        int i = 0;
        for(i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
