public class Partita {
    private String data;
    private Giocatore bianco;
    private Giocatore nero;
    private String risultato;
    private int numMosse;

    public Partita(String data ,Giocatore bianco,Giocatore nero,String risultato,int numMosse)throws errore{
        if(data==null){throw new errore("data mancante");}else{
            this.data=data;
        }
        if(risultato==null){throw new errore("risultato mancante");}else{
            this.risultato=risultato;
        }
        if(numMosse<=0){throw new errore("numero mosse negativo");}else{
            this.numMosse=numMosse;
        }
        this.bianco=bianco;
        this.nero=nero;
    }

    @Override
    public String toString() {
        return "Partita{" +
                "data='" + data + '\'' +
                ", bianco=" + bianco +
                ", nero=" + nero +
                ", risultato='" + risultato + '\'' +
                ", numMosse=" + numMosse +
                '}';
    }
}
