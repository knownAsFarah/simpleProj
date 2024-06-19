import java.util.Scanner;

public class Main {

    public static double add(double x, double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double mult(double x, double y){
        return x * y;
    }
    public static double div(double x, double y){
        return x / y;
    }
    public static double mod(double x, double y){
        return x % y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Calculator");
        System.out.println("Enter one of these symbols: {'+','-','*','/','%'}, Where:\n1) '+' is for the addition operation \n2) '-' is for the subtraction operation \n3) '*' is for the multiplication operation \n4) '/' is for the division operation \n5) '%' is for the modulus operation ");
        String op = sc.nextLine();
        System.out.println("Inter two numbers to calculate:");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        double result = 0;
        switch (op){
            case "+":
                result = add(firstNum, secondNum);
                break;
            case "-":
                result = sub(firstNum, secondNum);
                break;
            case "*":
                result = mult(firstNum, secondNum);
                break;
            case "/":
                result = div(firstNum, secondNum);
                break;
            case "%":
                result = mod(firstNum, secondNum);
                break;
            default:
                System.out.println("Please enter one of the characters above");
        }
        System.out.println(result);


    }
}