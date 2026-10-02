import java.util.ArrayList;

public class Visita {
    private String data;
    private String guida;
    private ArrayList<Persona> persone;
    private Sentiero sentiero;

    public Visita(String data,String guida,Sentiero sentiero)throws Errore{
        if(data==null){throw new Errore("data mancante");}else{
            this.data=data;
        }
        if(guida==null){throw new Errore("guida mancante");}else{
            this.guida=guida;
        }
        this.sentiero=sentiero;
        persone=new ArrayList<Persona>();
    }

    public void addPersone(Persona a){
        persone.add(a);
    }

    @Override
    public String toString() {
        return "Visita{" +
                "data='" + data + '\'' +
                ", guida='" + guida + '\'' +
                ", persone=" + persone +
                ", sentiero=" + sentiero +
                '}';
    }
}
