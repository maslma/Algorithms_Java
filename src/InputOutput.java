import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        System.out.print("Input your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        System.out.print("Input your height: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is: " + height);

        scanner.close();
    }
}