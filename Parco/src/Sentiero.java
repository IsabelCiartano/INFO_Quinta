import java.util.ArrayList;

public abstract class Sentiero {
    private String nome;
    private int lunghezza;
    private Tipo_difficolta difficolta;
    private ArrayList<Area> aree;

    public Sentiero(String nome,int lunghezza,Tipo_difficolta difficolta)throws Errore{
        if(nome==null){throw new Errore("nome mancante");}else{
            this.nome=nome;
        }
        if(lunghezza<=0){throw new Errore("lunghezza negativa");}else{
            this.lunghezza=lunghezza;
        }
        this.difficolta=difficolta;
        aree=new ArrayList<Area>();
    }
    public void addArea(Area a){
        aree.add(a);
    }

    @Override
    public String toString() {
        return "Sentiero{" +
                "nome='" + nome + '\'' +
                ", lunghezza=" + lunghezza +
                ", difficolta=" + difficolta +
                ", aree=" + aree +
                '}';
    }
}
