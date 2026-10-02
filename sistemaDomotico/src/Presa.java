public class Presa extends Dispositivo{
    private float consumoWatt;

    public Presa(String nome,TipoStato stato,float consumoWatt)throws Errore{
        super(nome ,stato);
        if(consumoWatt>=0){this.consumoWatt=consumoWatt;}else{throw new Errore("consumo negativo");}
    }
    @Override
    public String toString() {
        return "Presa{" +
                super.toString() +
                ", consumoWatt=" + consumoWatt +
                '}';
    }
}
