import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter boolean value: ");
        boolean input = Boolean.valueOf(scanner.nextLine());
        System.out.println("Opposite of \"" + input + "\" is \"" + (!input) + "\"");
    }
}