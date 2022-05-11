import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        int numberOne = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter value b: ");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        System.out.println("is " + numberOne + " equal to " + numberTwo + "? - " + (numberOne == numberTwo));
        System.out.println("is " + numberOne + " less than " + numberTwo + "? - " + (numberOne < numberTwo));
        System.out.println("is " + numberOne + " less or equal to " + numberTwo + "? - " + (numberOne <= numberTwo));
        System.out.println("is " + numberOne + " greater than " + numberTwo + "? - " + (numberOne > numberTwo));
        System.out.println("is " + numberOne + " greater or equal to " + numberTwo + "? - " + (numberOne >= numberTwo));
    }
}