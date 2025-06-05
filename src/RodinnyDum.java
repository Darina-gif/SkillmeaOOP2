public class RodinnyDum  extends Stavba {
//pokus

    private String material;

    private int pocetOken;

    public void zmenaRozlohy(float novaRozloha){
        rozloha = novaRozloha;
    }

    public float getRozloha() {
        return rozloha;
    }

    RodinnyDum(int pocetPoschodi, String material, float rozloha ) {
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }

        public float vypocetCenyDomu(int cenaZaMetr, String jmenoRodiny){
        float cena = rozloha * cenaZaMetr * pocetPoschodi;
        System.out.println(jmenoRodiny+ " " + cena);
        return cena;
    }

}