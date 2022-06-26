package modelo;

public class Peca {

    private String nome;
    private String local;
    private int quantidade;

    public Peca (String nome, String local, int quantidade){

        this.nome = nome;
        this.local = local;
        this.quantidade = quantidade;

    }

    public String getLocal() {
        return local;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}
