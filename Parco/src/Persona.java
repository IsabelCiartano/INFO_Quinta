public class Persona {
    private String nominativo;
    private String cellulare;
    private String lingue;

    public Persona(String nominativo,String cellulare,String lingue)throws Errore{
        if(nominativo==null){throw new Errore("nome  mancante");}else{
            this.nominativo=nominativo;
        }
        if(cellulare==null){throw new Errore("cellulare mancante");}else{
            this.cellulare=cellulare;
        }
        if(lingue==null){throw new Errore("lingue mancanti");}else{
            this.lingue=lingue;
        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nominativo='" + nominativo + '\'' +
                ", cellulare='" + cellulare + '\'' +
                ", lingue='" + lingue + '\'' +
                '}';
    }
}
