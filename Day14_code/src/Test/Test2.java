package Test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //1.
        int[] arr = new int[10];
        int i = 0;
        Random r = new Random();
        for( i = 0; i < arr.length; i++){
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        int sum = 0;
        for( i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        double a = sum / arr.length;
        System.out.println(a);
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] < a){
                count++;
            }
        }
        System.out.println(count);
    }
}
