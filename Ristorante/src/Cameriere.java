public class Cameriere extends Persona{
    private int numTavoli;

    public Cameriere(String nome,String cognome,float stipendio,int numTavoli)throws Errore{
        super(nome,cognome,stipendio);
        if(numTavoli<=0){throw new Errore("numero dei tavoli negativo");}else{
            this.numTavoli=numTavoli;
        }
    }

    @Override
    public String toString() {
        return "Cameriere{" +super.toString()+
                "numTavoli=" + numTavoli +
                '}';
    }
}
