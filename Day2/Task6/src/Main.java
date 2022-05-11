import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number a: ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter integer number b: ");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("a is " + a + " and b is " + b + " -> " + ((a == b) | (a < 0 & b > 0) | (a > 100 & b > 100)));
    }
}