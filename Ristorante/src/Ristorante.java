import java.util.ArrayList;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private ArrayList<Persona> personale;
    private ArrayList<Piatto> menu;

    public Ristorante(String nome,String indirizzo){
        this.nome=nome;
        this.indirizzo=indirizzo;
        personale=new ArrayList<Persona>();
        menu=new ArrayList<Piatto>();
    }

    public void addPiatto(Piatto p){
        menu.add(p);
    }
    public void addPersona(Persona p){
        personale.add(p);
    }
    public ArrayList<Piatto> piattiEconomici() {

        ArrayList<Piatto> economici = new ArrayList<>();

        if (menu.isEmpty())
            return economici;

        double minimo = 10;

        // cerca il prezzo minimo
        for (Piatto p : menu) {
            if (p.getPrezzo() < minimo) {
                minimo = p.getPrezzo();
            }
        }

        // aggiunge tutti i piatti con quel prezzo
        for (Piatto p : menu) {
            if (p.getPrezzo() == minimo) {
                economici.add(p);
            }
        }

        return economici;
    }

    @Override
    public String toString() {
        return "Ristorante{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", personale=" + personale +
                ", menu=" + menu +
                '}';
    }
}
