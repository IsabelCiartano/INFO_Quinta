public abstract class Persona {
    private String nome ;
    private String cognome;
    private float stipendio;

    public Persona(String nome,String cognome,float stipendio)throws Errore{
        if(nome==null){throw new Errore("nome mancante");}else{
            this.nome=nome;
        }
        if(cognome==null){throw new Errore("cognome mancante");}else{
            this.cognome=cognome;
        }
        if(stipendio<=0){throw new Errore("valore stipendio non valido");}else{
            this.stipendio=stipendio;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", stipendio=" + stipendio +
                '}';
    }
}
