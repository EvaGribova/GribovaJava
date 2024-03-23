import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Ввести a: ");
        int a = in.nextInt();
        System.out.print("Ввести b: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        System.out.println("Результат сложения: " + sum);
        int difference = a - b;
        System.out.println("Результат вычитания: " + difference);
        int multiply = a * b;
        System.out.println("Результат умножения: " + multiply);
        double division = (double) a / b;
        System.out.println("Результат деления: " + division);

    }
}
