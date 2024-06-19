import java.util.Scanner;

public class Main {

    public static double addition(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Calculator");
        System.out.println("Inter two numbers to add:");
        double firstNum = sc.nextDouble();
        double secondNum = sc.nextDouble();
        double result = addition(firstNum , secondNum);
        System.out.println(result);

    }
}