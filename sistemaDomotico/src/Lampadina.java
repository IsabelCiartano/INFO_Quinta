public class Lampadina extends Dispositivo{
    private  int tempColoreK;

        public Lampadina(String nome, TipoStato stato, int tempColoreK) throws Errore {
            super(nome, stato);
            if (tempColoreK <= 0) {
                throw new Errore("Temperatura colore non valida");
            }
            this.tempColoreK = tempColoreK;
        }
    @Override
    public String toString() {
        return "Lampadina{" +
                super.toString() +
                ", tempColoreK=" + tempColoreK +
                '}';
    }
    }

