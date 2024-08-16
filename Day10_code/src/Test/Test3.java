package Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lurushuzii");
        int start = sc.nextInt();
        System.out.println("jieguo");
        int end = sc.nextInt();
        int i, count = 0;

        for(i = start; i <= end; i++){
            if(i % 3==0 && i % 5==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
