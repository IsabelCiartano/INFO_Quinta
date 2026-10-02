public class Termostato extends Dispositivo{
    private float tempImpostataC;

    public Termostato(String nome,TipoStato stato, float tempImpostataC)throws Errore{
        super(nome,stato);
        if(tempImpostataC >=0){this.tempImpostataC=tempImpostataC;}else {
            throw new Errore("valore negativo non valido ");
        }
    }
    public String toString() {
        return "Termostato{" +
                super.toString() +
                ", tempImpostataC=" + tempImpostataC +
                '}';
    }
}
