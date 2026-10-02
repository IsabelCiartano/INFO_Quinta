public class Pedestre extends Sentiero{
    private int dislivello;

    public Pedestre(String nome,int lunghezza,Tipo_difficolta difficolta,int dislivello)throws Errore{
        super(nome, lunghezza, difficolta);
        if(dislivello<=0){throw new Errore("dislivello negativo");}else{
            this.dislivello=dislivello;
        }
    }

    @Override
    public String toString() {
        return "Pedestre{" +super.toString()+
                "dislivello=" + dislivello +
                '}';
    }
}
