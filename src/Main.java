import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Calculator");
        System.out.println("Inter two numbers to add:");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println(firstNum + secondNum);


    }
}