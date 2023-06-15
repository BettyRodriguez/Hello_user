import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        String greeting = "Привет, " + name + "! Добро пожаловать в нашу программу.";
        System.out.println(greeting);

        scanner.close();
    }
}
