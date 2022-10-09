import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        TContaBancaria[] contas = new TContaBancaria[0];
        TContaBancaria contaLogada;
        String controleMenu = "";
        Scanner scanner = new Scanner(System.in);

        contas = criarConta(iniciar(), contas);
        contaLogada = contas[0];

        while (!controleMenu.equalsIgnoreCase("S")) {

            if (controleMenu.equalsIgnoreCase("C")) {
                contas = criarConta(iniciar(), contas);
                if (contas.length > 1) {
                    System.out.println("Selecione uma conta para entrar:");
                    System.out.println();
                    for (int i = 0; i < contas.length; i++) {
                        System.out.println("[" + i + "] - " + contas[i].toString());
                    }
                    int selected = scanner.nextInt();
                    if (selected < contas.length && selected >= 0) {
                        contaLogada = contas[selected];
                    }
                }
            } else if (controleMenu.equalsIgnoreCase("T")) {
                if (contas.length > 1) {
                    System.out.println("Selecione uma conta para transferir:");
                    System.out.println();
                    for (int i = 0; i < contas.length; i++) {
                        if (contaLogada != contas[i]) {
                            System.out.println("[" + i + "] - " + contas[i].toString());

                        }
                    }
                    int selected = scanner.nextInt();
                    System.out.println("Digite o valor que a conta selecionada irá receber:");
                    double value = scanner.nextDouble();

                    if (selected < contas.length && selected >= 0 && value > 0) {
                        if (contaLogada.sacar(value) == 1) {
                            contas[selected].depositar(value);
                        } else {
                            System.out.println("Erro! Pressione qualquer tecla para continuar");
                            scanner.nextLine();
                        }

                    } else {
                        System.out.println("Erro! Pressione qualquer tecla para continuar");
                        scanner.nextLine();
                    }
                }

            } else if (controleMenu.equalsIgnoreCase("V")) {
                contaLogada.mostrarSaldo();
                System.out.println("Pressione qualquer tecla para continuar");
                scanner.nextLine();

            } else if (controleMenu.equalsIgnoreCase("W")) {
                System.out.println("Digite o valor que gostaria de retirar");
                contaLogada.sacar(scanner.nextDouble());
            } else if (controleMenu.equalsIgnoreCase("D")) {
                System.out.println("Digite o valor que gostaria de depositar");
                contaLogada.depositar(scanner.nextDouble());
            } else if (controleMenu.equalsIgnoreCase("A")) {
                clrscr();

                if (contas.length > 1) {
                    System.out.println("Selecione uma conta para entrar:");
                    System.out.println();
                    for (int i = 0; i < contas.length; i++) {
                        System.out
                                .println("[" + i + "] - " + contas[i].toString());
                    }
                    int selected = scanner.nextInt();
                    if (selected < contas.length && selected >= 0) {
                        contaLogada = contas[selected];
                    }
                }
            }

            clrscr();

            System.out.println("Conta atual: " + contaLogada.toString());
            mostrarOperacoes();
            controleMenu = scanner.nextLine();
        }
        scanner.close();
    }

    public static void mostrarOperacoes() {
        System.out.println();
        System.out.println("[S] - Sair ");
        System.out.println("[C] - Criar nova conta ");
        System.out.println("[T] - Transferência entre contas ");
        System.out.println("[V] - Mostrar Saldo ");
        System.out.println("[W] - Realizar Saque ");
        System.out.println("[D] - Fazer Depósito ");
        System.out.println("[A] - Alterar Conta ");
    }

    public static TContaBancaria iniciar() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        clrscr();
        System.out.println("Vamos criar uma nova conta!");
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu CPF:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o saldo que será depositado inicialmente:");
        double saldo = scanner.nextDouble();
        int numero = rand.nextInt(99999);
        System.out.println("Anote os dados da sua nova conta e pressione ENTER para continuar:");
        System.out.println("Agência: 356 | Conta: " + numero);
        System.out.println();
        scanner.nextLine();
        clrscr();

        return new TContaBancaria(numero, 356, cpf, nome, saldo);
    }

    public static TContaBancaria[] criarConta(TContaBancaria novaConta,
            TContaBancaria[] contas) {

        TContaBancaria[] auxContas = new TContaBancaria[contas.length + 1];
        for (int i = 0; i < contas.length; i++) {
            auxContas[i] = contas[i];
        }
        auxContas[auxContas.length - 1] = novaConta;
        return auxContas;
    }

    public static void clrscr() {
        // Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
