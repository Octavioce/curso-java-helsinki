
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int numbersSum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            counter++;
            numbersSum += number;
        }
        double average = (double) numbersSum / counter;
        System.out.println("Average of the numbers: " + average);
    }
}
