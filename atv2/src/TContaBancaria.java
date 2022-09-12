public class TContaBancaria {
    private int numero, agencia;
    public String cpf, nome;
    private double saldo;

    TContaBancaria(int _numero, int _agencia, String _cpf, String _nome, double _saldo) {
        numero = _numero;
        agencia = _agencia;
        cpf = _cpf;
        nome = _nome;
        saldo = _saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        } else {
            System.out.println("Operação não pode ser realizada, valor inválido.");
        }
    }

    public int sacar(double valorSaque) {
        if (valorSaque > 0) {
            if (saldo - valorSaque >= 0) {
                saldo -= valorSaque;
                return 1;
            } else {
                System.out.println("Seu saldo é insuficiente para realizar essa operação.");
                return 0;
            }

        } else {
            System.out.println("Operação não pode ser realizada, valor inválido.");
            return -1;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Seu saldo é de R$" + saldo);
    }

    public String toString() {
        return Integer.toString(agencia) + '-' + Integer.toString(numero) + " (" + nome + ")";
    }

}
