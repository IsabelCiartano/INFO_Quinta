public class Animale {
    private String nome_comune;
    private String nome_specifico;
    private String classeTax;
    private Stato statoIUCN;

    public Animale(String nome_comune,String nome_specifico,String classeTax,Stato statoIUCN)throws Errore{
        if(nome_comune==null){throw new Errore("nome comune mancante");}else{
            this.nome_comune=nome_comune;
        }
        if(nome_specifico==null){throw new Errore("nome specifico mancante");}else{
            this.nome_specifico=nome_specifico;
        }
        if(classeTax==null){throw new Errore("classe mancante");}else{
            this.classeTax=classeTax;
        }
        this.statoIUCN=statoIUCN;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "nome_comune='" + nome_comune + '\'' +
                ", nome_specifico='" + nome_specifico + '\'' +
                ", classeTax='" + classeTax + '\'' +
                ", statoIUCN=" + statoIUCN +
                '}';
    }
    public boolean inPericolo(){
        if(statoIUCN==Stato.CR||statoIUCN==Stato.EN){
            return true;
        }
        return false;
    }
}
