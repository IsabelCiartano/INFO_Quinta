import java.util.ArrayList;

public class Area {
    private String nome;
    private int superficie;
    private ArrayList<Animale> specie;

    public Area(String nome,int superficie)throws Errore{
        if(nome==null){throw new Errore("nome mancante ");}else{
            this.nome=nome;
        }
        if(superficie<=0){throw new Errore("superficie negativa");}else{
            this.superficie=superficie;
        }
        specie=new ArrayList<Animale>();
    }

    public void addAnimale(Animale a){
        specie.add(a);
    }

    @Override
    public String toString() {
        return "Area{" +
                "nome='" + nome + '\'' +
                ", superficie=" + superficie +
                ", specie=" + specie +
                '}';
    }
}
