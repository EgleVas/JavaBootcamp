import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Number is odd: " + (number % 2 != 0));
    }
}