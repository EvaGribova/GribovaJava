import java.util.Scanner;
import java.util.StringJoiner;

public class ThirdPoint {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        StringJoiner evenNumbers = new StringJoiner(", ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                evenNumbers.add(String.valueOf(numbers[i]));
            }
        }
        System.out.println(evenNumbers);
    }
}
