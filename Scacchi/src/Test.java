public class Test {
    static void main(String[] args) {
        try{
        Dilettante d=new Dilettante(50,"mario","rossi","asd scacchi");
        Professionista p=new Professionista(100,"luigi","verdi",Titolo.CM,"ITA");

        Partita partita=new Partita("11/08/26",d,p,"vittoria nero",60);
        Torneo t=new Torneo("regionale",2026);
        t.addpartita(partita);

            System.out.println(t);
    } catch (errore e) {
            throw new errore("errore");
        }
}}
