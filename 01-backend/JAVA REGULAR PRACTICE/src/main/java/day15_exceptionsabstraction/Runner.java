package day15_exceptionsabstraction;

import static day15_exceptionsabstraction.Kayit.counter;

public class Runner {

    public static void main(String[] args) {

        Kayit obje = new Kayit();
        obje.kayit();
        System.out.println(counter+ " kez dogru kullanici girisi yapildi");



    }


}
