import java.util.Scanner;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        AlteracaoUnica[] numeros = new AlteracaoUnica[5];
        String menu = "s";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new AlteracaoUnica();
        }
        while (menu.matches("s")) {
            for (int j = 0; j < numeros.length; j++) {

                System.out.println("Deseja alterar o " + (j + 1) + " º número? [s] ou [n]");
                String opt = scanner.nextLine();
                if (opt.matches("s")) {
                    System.out.println("Digite o valor para inserir");
                    numeros[j].setValor(scanner.nextDouble());
                    scanner.nextLine();
                }
            }
            System.out.println("Deseja continuar? [s] ou [n]");
            menu = scanner.nextLine();

        }

    }
}
