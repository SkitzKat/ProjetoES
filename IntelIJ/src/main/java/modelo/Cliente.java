package modelo;

import java.util.List;

public class Cliente {

    private String nome;
    private int nif;
    private int contacto;
    private String morada;
    private List<Transacao> transacoesDoCliente;


    public Cliente (String nome, int nif, int contacto, String morada, List<Transacao> transacoesDoCliente){

        this.nome = nome;
        this.contacto = contacto;
        this.nif = nif;
        this.morada = morada;
        this.transacoesDoCliente = transacoesDoCliente;
    }

    public String getNome() {
        return nome;
    }

    public int getContacto() {
        return contacto;
    }

    public int getNif() {
        return nif;
    }

    public String getMorada() {
        return morada;
    }

    public List<Transacao> getTransacoesDoCliente() {
        return transacoesDoCliente;
    }
}
