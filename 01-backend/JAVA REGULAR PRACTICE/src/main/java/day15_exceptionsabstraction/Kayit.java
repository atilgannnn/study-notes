package day15_exceptionsabstraction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner{

    static List<String> listKullaniciID = new ArrayList<>();//List'lerden constructor olusturamıyoruz o sebeple ArrayList aldık
    static List<Integer> listkullaniciSaniye = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static int counter = 0;


    public void kayit(){

        String kullaniciID = "";
        System.out.println("Lutfen kullanici ID giriniz");
        kullaniciID = input.nextLine();

        int kullaniciSaniye = LocalDateTime.now().getSecond();//0 ile 60 arasinda bir deger verir.

        System.out.println("Kullanici saniye "+kullaniciSaniye);

        listKullaniciID.add(kullaniciID);
        listkullaniciSaniye.add(kullaniciSaniye);

        tamamMiDevamMi();


    }//kayit() method body'si

    private void tamamMiDevamMi() {

        String tmmMDvmmM = "";


        do {

            System.out.println("Baska Kayit Var Mi? (E/H) ");
            tmmMDvmmM = input.next();

            if (tmmMDvmmM.equalsIgnoreCase("e")){

                kayit();

            }else if(tmmMDvmmM.equalsIgnoreCase("h")){

                System.out.println("Gule gule");

                break;
            }





        }while (!tmmMDvmmM.equalsIgnoreCase("e")&&!tmmMDvmmM.equalsIgnoreCase("h"));

        counter++;

        if (counter == 1){//bunu yazmazsak Array'i tekrar tekrar yazdirir

            SansliKullanici snslKlnc = new SansliKullanici();

            snslKlnc.sansliKullaniciYazdir(listKullaniciID,listkullaniciSaniye);


        }



    }


}
