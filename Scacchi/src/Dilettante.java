public class Dilettante extends Giocatore{
    private String club;

    public Dilettante(int punteggio,String nome, String cognome,String club)throws errore{
        super(punteggio, nome, cognome);
        if(club==null){throw new errore("club mancante ");}else{
            this.club=club;
        }
    }

    @Override
    public String toString() {
        return "Dilettante{" +super.toString()+
                "club='" + club + '\'' +
                '}';
    }
}
