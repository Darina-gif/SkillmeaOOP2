public class Banka {
    private int roky;
    private float pocatecniVlad;
    private float urokovaSadzba;
    private float poplatky;
    private float konecnaCastka;

    Banka(int roky, float pocatecniVlad, float urokovaSadzba, float poplatky) {
        this.roky = roky;
        this.pocatecniVlad = pocatecniVlad;
        this.urokovaSadzba = urokovaSadzba;
        this.poplatky = poplatky;

         }

     public float vypocetSporicihoUctu() {
        konecnaCastka = pocatecniVlad;

        for(int i = 0; i < roky;i++) {
            konecnaCastka += konecnaCastka * (urokovaSadzba/100) - poplatky;
        }

       return konecnaCastka;

     }

}
