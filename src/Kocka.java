public class Kocka extends Zvire {


    private int pocetUlovenychRyb;

    Kocka(int pocetNohou, String rasa, float hmotnost, int pocetUlovenychRyb) {
        this.pocetNohou = pocetNohou;
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.pocetUlovenychRyb = pocetUlovenychRyb;
}

    public void udelejZvuk() {
        System.out.println("Mnau");
    }
}
