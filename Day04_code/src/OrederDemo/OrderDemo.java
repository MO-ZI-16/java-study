package OrederDemo;

import java.util.Scanner;

//if语句
public class OrderDemo {
    public static void main(String[] args) {
        //if(关系表达式){
            //语句体;
        //}
        Scanner sc = new Scanner(System.in);
        System.out.println("酒量");
        int wine = sc.nextInt();
        //2.
        if(wine>2){
            System.out.println("小伙子可以");
        }
    }
}
