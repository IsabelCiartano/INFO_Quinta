public class Professionista extends Giocatore{
    private Titolo titoloFIDE;
    private String paese;

    public Professionista(int punteggio,String nome,String cognome,Titolo titoloFIDE,String paese)throws errore{
        super(punteggio, nome, cognome);
        if(paese==null){throw new errore("paese mancante");}else{
            this.paese=paese;
        }
        this.titoloFIDE=titoloFIDE;
    }

    @Override
    public String toString() {
        return "Professionista{" +super.toString()+
                "titoloFIDE=" + titoloFIDE +
                ", paese='" + paese + '\'' +
                '}';
    }
}
