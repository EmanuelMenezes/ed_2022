import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int i;
        Carro[] carros = new Carro[5];
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            String modelo;
            float rend;
            System.out.print("Digite o modelo do " + (i + 1) + "º carro: \n");
            modelo = scanner.nextLine();
            System.out.print("Digite o consumo do " + (i + 1) + "º carro (km/L): \n");
            rend = scanner.nextFloat();
            scanner.nextLine();
            Carro carroAtual = new Carro(rend, modelo);
            carros[i] = carroAtual;
        }
        scanner.close();

        int maior = 0;
        for (i = 0; i < 4; i++) {

            if (carros[i].getRendimento() > carros[maior].getRendimento()) {
                maior = i;
            }
        }
        System.out.print("Para percorrer 1000km, os veículos gastam, respectivamente:\n");
        for (int j = 0; j < carros.length; j++) {
            System.out.println(carros[j].getNomeModelo() + " -> " + carros[j].calculaGastoCombustivel(1000) + " L");
        }

        System.out.print("O modelo mais econômico é: " + carros[maior].getNomeModelo() + " \n");
    }
}
