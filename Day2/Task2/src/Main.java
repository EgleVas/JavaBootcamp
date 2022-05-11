import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter b1: ");
        boolean b1 = Boolean.valueOf(scanner.nextLine());
        System.out.print("Enter b2: ");
        boolean b2 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Is b1 and b2 equal? - " + (b1 == b2));
    }
}