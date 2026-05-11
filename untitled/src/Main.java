import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um numero divisivel:");
                int num = input.nextInt();
                System.out.println("Digite outro:");
                int num2 = input.nextInt();
                System.out.println(num / num2);
            } catch (ArithmeticException e) {
                System.out.println("Digite um numero válído!");
                continue;
            }
        }
    }
}