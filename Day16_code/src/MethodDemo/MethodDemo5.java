package MethodDemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        double sum = getsum(1,34,4);
        System.out.println(sum);

        System.out.println(getsum(1,34,4));
    }

    public static double getsum(int num1, int num2, int num3){
        double result = num1 + num2 + num3;
        return result;
    }
}
