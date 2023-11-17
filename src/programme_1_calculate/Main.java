package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring a Scanner Object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter First number : ");
            int a = scanner.nextInt();
            System.out.println("Enter Second number");
            int b = scanner.nextInt();
            System.out.println("Enter one of symbol: +,-,*,/: ");
            char symbol = scanner.next().charAt(0);
            Calculate calculator = new Calculate();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation. y or n: ");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //closing a scanner object
        scanner.close();
    }
}
