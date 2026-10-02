import java.util.ArrayList;

public class Torneo {
    private String nome;
    private int anno ;
    private ArrayList<Partita> partite;

    public Torneo(String nome,int anno){
        this.nome=nome;
        this.anno=anno;
        partite=new ArrayList<Partita>();
    }

    public void addpartita(Partita p){
        partite.add(p);
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "nome='" + nome + '\'' +
                ", anno=" + anno +
                ", partite=" + partite +
                '}';
    }
}
