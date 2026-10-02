public class Ciclabile extends Sentiero{
    private String tipo_fondo;
    private boolean vietato;

    public Ciclabile(String nome,int lunghezza,Tipo_difficolta difficolta,String tipo_fondo,boolean vietato)throws Errore{
        super(nome, lunghezza, difficolta);
        if(tipo_fondo==null){throw new Errore("tipologia di fondo mancante ");}else{
            this.tipo_fondo=tipo_fondo;
        }
        this.vietato=vietato;
    }

    @Override
    public String toString() {
        return "Ciclabile{" +super.toString()+
                "tipo_fondo='" + tipo_fondo + '\'' +
                ", vietato=" + vietato +
                '}';
    }
}
