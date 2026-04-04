import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("O número %d é par.\n", number);
        } else {
            System.out.printf("O número %d é ímpar.", number);
        }
    }
}
