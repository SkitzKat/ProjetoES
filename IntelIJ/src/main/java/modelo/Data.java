package modelo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public static Data parseData (String data){

        return new Data(1,1,1);

    }

}
