import java.util.Scanner;

public class Atv3Parte1 {
    public static void main(String[] args) throws Exception {
        // Stack de Registros Agenda
        Stack<Agenda> agendaStack = new Stack<Agenda>(5);

        menu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a Opção Desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Inserindo um novo registro na agenda");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.next();
                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.next();
                    Agenda agenda = new Agenda(nome, telefone);
                    agendaStack.push(agenda);
                    break;
                case 2:
                    if (agendaStack.isEmpty()) {
                        System.out.println("A pilha está vazia");
                    } else {
                        System.out.println("Removendo o último registro da agenda");
                        agendaStack.pop();
                    }
                    break;

                case 3:
                    System.out.println("Imprimindo o tamanho da Agenda");
                    System.out.println(agendaStack.size());
                    break;
                case 4:
                    if (agendaStack.isEmpty()) {
                        System.out.println("A pilha está vazia");
                    } else {
                        System.out.println("Imprimindo o último registro da agenda");
                        Agenda ultimoRegistro = agendaStack.peek();
                        System.out.println(ultimoRegistro.toString());
                    }
                    break;
                case 5:
                    System.out.println("Sair");
                    System.exit(0);
                    break;

            }
        }

    }

    public static void menu() {
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Imprimir Tamanho");
        System.out.println("4 - Imprimir Topo");
        System.out.println("5 - Sair");
    }

}
