package test;

public class Arrtest1 {
    public static void main(String[] args) {
        int[] arr = {1,23,34,4,4,78};
        int i = 0,sum = 0;
        for(i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

