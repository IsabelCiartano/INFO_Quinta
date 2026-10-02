import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
try{
        // Creazione del cuoco
        Cuoco cuoco = new Cuoco(
                "Mario",
                "Rossi",
                1800,TipoSpecializzazione.ITALIANA
        );

        // Creazione del cameriere
        Cameriere cameriere = new Cameriere(
                "Luca",
                "Bianchi",
                1400,
                8
        );
        // Creazione del ristorante
        Ristorante ristorante = new Ristorante(
                "La Pergola",
                "Via Roma 10"
        );



        ristorante.addPiatto(new Piatto(
                "Spaghetti alla Carbonara",
                8,TipoPiatto.PRIMO,"pasta,uova,guanciale"
        ));

        ristorante.addPiatto(new Piatto(
                "Penne al Pomodoro",
                8,TipoPiatto.PRIMO,"pasta,sugo al pomodoro"
        ));

        ristorante.addPiatto(new Piatto(
                "Bistecca ai Ferri",
                18,TipoPiatto.SECONDO,"bistecca di manzo,olio,sale"
        ));
        ristorante.addPersona(cuoco);
        ristorante.addPersona(cameriere);



        // Stampa dei piatti più economici
        System.out.println("Piatti più economici:");

        ArrayList<Piatto> economici = ristorante.piattiEconomici();

        for (Piatto p : economici) {
            System.out.println(
                    p.getNome() +
                            " - " +
                            p.getPrezzo() + " €"
            );
        }
    System.out.println(ristorante);

    }catch(Errore e){  System.out.println("ERRORE: " + e.getMessage());
    }}
}
