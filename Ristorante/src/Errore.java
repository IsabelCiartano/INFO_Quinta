public class Errore extends Exception {
    public Errore(String messaggio) {
        super(messaggio);
    }

    public Errore() {
        super("Valore non valido.");
    }
}
