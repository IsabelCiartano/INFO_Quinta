public abstract class Giocatore {
    private int punteggio;
    private String nome;
    private String cognome;
    private static  int PMAX=3000;

    public Giocatore(int punteggio,String nome,String cognome)throws errore{
        if(punteggio>=0||punteggio<=PMAX){this.punteggio=punteggio;}else{
            throw new errore("punteggio non rispetta i paramtri ");
        }
        if(nome==null){throw new errore("nome mancante");}else{
            this.nome=nome;
        }
        if(cognome==null){throw new errore("cognome mancante");}else{
            this.cognome=cognome;
        }
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "punteggio=" + punteggio +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
