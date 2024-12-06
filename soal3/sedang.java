import java.util.Random;
import java.util.Scanner;

public class sedang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
            char operator = "+*/%".charAt(random.nextInt(3));
            int correctAnswer = switch (operator) {
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> num1 % num2;
            };

            System.out.printf("%d %c %d = ", num1, operator, num2);
            int userAnswer = scanner.nextInt();

            System.out.println(userAnswer == correctAnswer ? "Benar!" : "Salah! Jawaban: " + correctAnswer);

            System.out.print("Lanjut? (ya/tidak): ");
            if (scanner.next().equalsIgnoreCase("tidak")) break;
        }
        System.out.println("see you!!");
    }
}