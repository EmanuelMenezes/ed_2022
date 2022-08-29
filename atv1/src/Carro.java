//classe para auxiliar no terceiro exercicio

public class Carro {
    private float rendimento;
    private String nomeModelo;

    public Carro(float _rendimento, String _nomeModelo) {
        this.rendimento = _rendimento;
        this.nomeModelo = _nomeModelo;
    }

    public float calculaGastoCombustivel(float km) {
        if (rendimento != 0) {
            return km / rendimento;

        } else {
            return -1;
        }
    }

    public void setRendimento(float _rendimento) {
        this.rendimento = _rendimento;
    }

    public float getRendimento() {
        return this.rendimento;
    }

    public void setNomeModelo(String _NomeModelo) {
        this.nomeModelo = _NomeModelo;
    }

    public String getNomeModelo() {
        return this.nomeModelo;
    }

}
