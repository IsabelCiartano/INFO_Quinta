import java.util.ArrayList;

public class Abitazione {
    private String indirizzo;
    private ArrayList<Stanza> stanze;


    public Abitazione(String indirizzo)throws Errore{
        if(indirizzo==null){throw new Errore("abitazione senz indirizzo");}else{this.indirizzo=indirizzo;}
        this.stanze=new ArrayList<Stanza>();
    }

    public void addStanza(Stanza s){
        if(s!= null){
            stanze.add(s);
        }
    }
    @Override
    public String toString() {
        return "Abitazione{" +
                "indirizzo='" + indirizzo + '\'' +
                ", stanze=" + stanze +
                '}';
    }
}
