package modelo;

public class Transacao {

    private int montante;
    private boolean isCompra;
    private boolean isVenda;
    private String nomeCliente;

    public Transacao(int montante, String nomeCliente, boolean isCompra, boolean isVenda){
        this.montante = montante;
        this.nomeCliente = nomeCliente;
        this.isCompra = isCompra;
        this.isVenda = isVenda;

    }
    public int getMontante() {
        return montante;
    }

    public String getnomeCliente() {
        return nomeCliente;
    }

    public boolean getIsCompra() {
        return isCompra;
    }

    public boolean isVenda() { return isVenda; }
}
