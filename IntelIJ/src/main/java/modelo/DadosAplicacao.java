package modelo;

import java.util.ArrayList;
import java.util.List;

public class DadosAplicacao {

    public static DadosAplicacao INSTANCE = new DadosAplicacao();

    private List<Veiculo> veiculos;

    private List<Evento> eventos;

    private List<Cliente> clientes;

    private  List<Transacao> transacoes;

    private List<Peca> pecas;

    private DadosAplicacao(){

        veiculos = new ArrayList<Veiculo>();

        eventos = new ArrayList<Evento>();

        clientes = new ArrayList<Cliente>();

        transacoes = new ArrayList<Transacao>();

        pecas = new ArrayList<Peca>();

    }

    public void adicionarVeiculo(Veiculo veiculo){

    }

    public void removerVeiculo(Veiculo veiculo){

    }

    public void adicionarEvento (Evento evento){

    }

    public void adicionarCliente (Cliente cliente){

    }

    public void adiocionarTransacao (Transacao transacao){

    }

    public void adicionarPeca (Peca peca){

    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

}
