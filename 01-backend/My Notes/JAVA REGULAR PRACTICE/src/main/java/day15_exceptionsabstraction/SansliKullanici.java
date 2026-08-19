package day15_exceptionsabstraction;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullaniciYazdir(List<String> listKullaniciID, List<Integer> listkullaniciSaniye) {
        
        List<String> sansliKullaniciIndexes = new ArrayList<>();

        for (int i = 0; i < listkullaniciSaniye.size(); i++) {

            if (listkullaniciSaniye.get(i)<10){

                sansliKullaniciIndexes.add(listKullaniciID.get(i));

            }

        }

        System.out.println("Sansli Kullanicilar");
        System.out.println(sansliKullaniciIndexes);


    }
}
