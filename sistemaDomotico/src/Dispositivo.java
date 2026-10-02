public  abstract class Dispositivo {
    private String nome;
    private TipoStato stato;


    public Dispositivo(String nome,TipoStato stato)throws Errore{
        if(nome==null){throw new Errore("nome vuoto");}else{this.nome=nome;}
        if(stato==null){throw new Errore("stato vuoto");}else{this.stato=stato;}
    }
    @Override
    public String toString() {
        return "Dispositivo{" +
                "nome='" + nome + '\'' +
                ", stato=" + stato +
                '}';
    }
}