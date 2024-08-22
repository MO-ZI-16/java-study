package Test;

public class Test3 {
    public static void main(String[] args) {
        double area1 = getArea(4,4);
        double area2 = getArea(5,3.4);
        if(area1 > area2){
            System.out.println("big");;
        }else {
            System.out.println("sall");
        }
    }
    public static double getArea(double len1, double width1) {
        double area1 = len1*width1;
        return area1;
    }
   /* public static void compare(double len1, double width1,double len2, double width2){
        double area1 = len1*width1;
        double area2 = len2*width2;

    }*/
}
