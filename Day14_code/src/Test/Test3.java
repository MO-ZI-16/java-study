package Test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {22,2,34,4,4,5};
        int i = 0,tem = 0, s = arr.length - 1;

        for(i = 0; i < arr.length/2; i++){
            tem = arr[i];
            arr[i] = arr[s];
            arr[s] = tem;
            s--;
        }
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
