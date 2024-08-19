package test;

public class Arrtest2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = 0, count = 0;
        for(i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
