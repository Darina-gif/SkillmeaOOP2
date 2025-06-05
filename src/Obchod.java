public class Obchod extends Stavba {

    private int pocetPokladen;

    Obchod(float rozloha, int pocetPoschodi, int pocetPokladen) {
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladen = pocetPokladen;
    }

    public float vypocetCenyObchodu(){
        float cena = (rozloha * pocetPoschodi * 500) + 5000 * pocetPokladen;
        System.out.println("Cena obchodu: " + cena);
        return cena;


    }



}