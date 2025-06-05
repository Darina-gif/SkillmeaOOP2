import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random nahCislo = new Random();
        //nahCislo.nextInt();

        RodinnyDum dumNovaku = new RodinnyDum(4,"Mramor", 457f  );

        float cenaPrvnihoDomu =  dumNovaku.vypocetCenyDomu(300, "Novakovi");

        RodinnyDum dumZajicu =  new RodinnyDum(3,"Mramor", 6457f  );

        float cenaDruhehoDomu =   dumZajicu.vypocetCenyDomu(250, "Zajicovi");

        System.out.println(cenaPrvnihoDomu+cenaDruhehoDomu);

        Obchod kaufland = new Obchod(2600f, 2, 25);
        kaufland.vypocetCenyObchodu();

        //Misto pro zverimex
        Pes alik = new Pes(4, "labrador", 15, 2);
        alik.udelejZvuk();
        Kocka micka = new Kocka(4, "Perska", 5, 10);
        micka.udelejZvuk();

    }
}