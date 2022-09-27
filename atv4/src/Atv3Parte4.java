import java.util.Scanner;

public class Atv3Parte4 {
    public static void main(String[] args) {
        Stack<Integer> evenStack = new Stack<Integer>(10);
        Stack<Integer> oddStack = new Stack<Integer>(10);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenStack.push(number);
            } else {
                oddStack.push(number);
            }
        }
        scanner.close();

        System.out.println("Pilha de números pares");
        while (!evenStack.isEmpty()) {
            System.out.println(evenStack.pop());
        }

        System.out.println("Pilha de números ímpares");
        while (!oddStack.isEmpty()) {
            System.out.println(oddStack.pop());
        }

    }
}
