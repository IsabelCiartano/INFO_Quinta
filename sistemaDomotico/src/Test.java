public class Test {
    public static void main(){
        try {
            Abitazione a = new Abitazione("via torino 8,cuneo");

            Stanza s1 = new Stanza("cucina", 1);
            Stanza s2 = new Stanza("Salotto", 0);
            a.addStanza(s1);
            a.addStanza(s2);

            Presa p1 = new Presa("frigorifero", TipoStato.ACCESO, 1200);
            Lampadina l1 = new Lampadina("Lampada centrale ", TipoStato.ACCESO, 3000);
            Termostato t1 = new Termostato("Termostato salotto", TipoStato.SPENTO, 20);
            s1.addDispositivo(p1);
            s2.addDispositivo(l1);
            s2.addDispositivo(t1);

            System.out.println(a);
        } catch (Errore e) {
            System.out.println("ERRORE: " + e.getMessage());
        }
    }
}
