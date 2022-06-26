package modelo;

public class Veiculo {

    private String matricula;
    private String modelo;
    private String marca;
    private String donoAnterior;
    private String descricao;
    private int numeroDeDonos;


    public Veiculo(String matricula, String modelo, String marca, String donoAnterior, String descricao, int numeroDeDonos){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca= marca;
        this.donoAnterior = donoAnterior;
        this.descricao = descricao;
        this.numeroDeDonos = numeroDeDonos;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDonoAnterior() {
        return donoAnterior;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroDeDonos() {
        return numeroDeDonos;
    }
}
