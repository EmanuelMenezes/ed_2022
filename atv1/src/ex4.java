import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] valorRoubado = new int[10];
        int menor = 0, total = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < valorRoubado.length; i++) {
            System.out.println("Informe o valor ecnontrado com o " + (i + 1) + "º indivíduo:");
            valorRoubado[i] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Qual o menor valor roubado?");
        menor = scanner.nextInt();
        for (int j = 0; j < valorRoubado.length; j++) {
            if (valorRoubado[j] >= menor && valorRoubado[j] % 10 == 0) {
                total += valorRoubado[j];
            }
        }
        System.out.println(
                "Com base nas informações prestadas, o valor total roubado é de R$ " + total + ",00");

    }
}
