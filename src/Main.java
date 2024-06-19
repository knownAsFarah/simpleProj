import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Calculator");
        System.out.println("Enter one of these symbols: {'+','-','*','/','%'}, Where:\n1) '+' is for the addition operation \n2) '-' is for the subtraction operation \n3) '*' is for the multiplication operation \n4) '/' is for the division operation \n5) '%' is for the modulus operation ");
        String op = sc.nextLine();
        System.out.println("Inter two numbers to calculate:");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println(firstNum + secondNum);


    }
}