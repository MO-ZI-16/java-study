package Test;

public class Test2 {
    public static void main(String[] args){
        boolean isLightingGreen = false;
        boolean isLightingYellow = false;
        boolean isLightingRed = true;
        if(isLightingGreen){
            System.out.println("GOGO!!!");
        }else if(isLightingYellow){
            System.out.println("Slow!!!");
        }else if(isLightingRed){
            System.out.println("Stop!!!");
        }
    }
}
