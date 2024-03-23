import java.util.Scanner;

public class SecondPoint {
    public static void main(String[] args) {

        Scanner second = new Scanner(System.in);
        System.out.print("Ввести a: ");
        String a = second.nextLine();
        System.out.print("Ввести b: ");
        String b = second.nextLine();

        if ( a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
