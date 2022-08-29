//classe para auxiliar no exercicio 5

public class AlteracaoUnica {
    private boolean alterado;
    private double valor;

    public AlteracaoUnica() {
        this.alterado = false;
    }

    public void setValor(double _valor) {
        if (!this.alterado) {
            this.valor = _valor;
            this.alterado = true;
        } else {
            System.out.println("O valor desse elemento já foi alterado anteriormente");
        }
    }
}
