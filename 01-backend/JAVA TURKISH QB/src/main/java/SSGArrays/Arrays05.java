package SSGArrays;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {


        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran bir method olusturun
        String cumle= "Nerede o 'hello world' yazdiramayan ogrenciler?";
        char harf = 'i';
        harfKarakterKacKereKullanilmis(cumle,harf);



    }

    public static void harfKarakterKacKereKullanilmis(String cumle, char harf){

        int sayi = 0;
        String harfstr = ""+harf;
        String karakterler [] = cumle.split("");
        System.out.println(Arrays.toString(karakterler));
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harfstr)){
                sayi++;
            }

        }

        System.out.println("aradiginiz " +harf+ " verilen cumlede " +sayi+ " tane var");

    }



}
