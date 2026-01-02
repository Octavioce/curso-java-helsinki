
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int endNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int initialNumber = Integer.valueOf(scanner.nextLine());
        for (; initialNumber <= endNumber; initialNumber++) {
            System.out.println(initialNumber);
        }
    }
}
