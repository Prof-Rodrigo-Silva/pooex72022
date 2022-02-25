package classes.modelo;

public class Compromisso {

	private int dia;
    private int mes;
    private String descricao;

    public Compromisso() {

    }
    
    public Compromisso(int dia, int mes, String descricao) {
        this.dia = dia;
        this.mes = mes;
        this.descricao = descricao;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + " - " + descricao;
    }    
}
