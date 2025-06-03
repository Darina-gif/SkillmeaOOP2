public class RodinnyDum {
    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    public void vypocetCenyDomu(int cenaZaMetr, String jmenoRodiny){
        float cena = rozloha * cenaZaMetr * pocetPoschodi;
        System.out.println(jmenoRodiny+ " " + cena);

    }

}