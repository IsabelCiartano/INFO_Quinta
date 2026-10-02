import java.util.ArrayList;

public class Stanza {
    private String nome;
    private int piano;
    private ArrayList<Dispositivo> dispositivi;

    public Stanza(String nome,int piano)throws Errore{
        if(nome==null){throw new Errore("nome vuoto");}else{this.nome=nome;}
        this.piano=piano;
        this.dispositivi=new ArrayList<Dispositivo>();
    }
    public void addDispositivo(Dispositivo d){
        if (d!=null){
            dispositivi.add(d);
        }
    }
    @Override
    public String toString() {
        return "Stanza{" +
                "nome='" + nome + '\'' +
                ", piano=" + piano +
                ", dispositivi=" + dispositivi +
                '}';
    }
}
