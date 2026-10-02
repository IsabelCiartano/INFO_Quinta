public class Cuoco extends Persona{
    private TipoSpecializzazione specializzazione;

    public Cuoco(String nome,String cognome,float stipendio,TipoSpecializzazione specializzazione)throws Errore{
        super(nome,cognome,stipendio);
        this.specializzazione=specializzazione;
    }

    @Override
    public String toString() {
        return "Cuoco{" + super.toString()+
                "specializzazione=" + specializzazione +
                '}';
    }
}
