package modelo;

public class Evento {

    private String local;
    private Data dataInicio;
    private Data dataFim;
    private int numeroVeiculosEmExposicao;

    public Evento(String local, Data dataInicio, Data dataFim, int numeroVeiculosEmExposicao){
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.numeroVeiculosEmExposicao = numeroVeiculosEmExposicao;
    }

    public String getLocal() {
        return local;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public int getNumeroVeiculosEmExposicao() {
        return numeroVeiculosEmExposicao;
    }
}

