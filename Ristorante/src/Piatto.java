public class Piatto {
    private String nome;
    private float prezzo;
    private TipoPiatto categoria;
    private String ingredienti;

    public Piatto(String nome,float prezzo,TipoPiatto categoria,String ingredienti )throws Errore{
        if(nome==null){throw new Errore("nome mancante");}else{
            this.nome=nome;
        }
        if(prezzo<=0){throw new Errore("prezzo stipendio non valido");}else{
            this.prezzo=prezzo;
        }
        this.categoria=categoria;
        if(ingredienti==null){throw new Errore("ingredienti mancanti");}else{
            this.ingredienti=ingredienti;
        }
    }

    public float getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Piatto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", categoria=" + categoria +
                ", ingredienti='" + ingredienti + '\'' +
                '}';
    }
}
