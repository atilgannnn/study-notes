package SwitchOnStatement;

public class Sayfa32 {


    public static void main(String[] args) {

        /*

        5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
        Örnek: 2000 yılının Şubat ayında gün sayısı 29.

         */

        int ay = 2;
        int yil = 2020;
        int gunSayisi = 0;

        switch(ay){

            case 1: case 3: case 5: case 7: case 8:
            case 10: case 12:
                gunSayisi = 31;
                break;
            case 4: case 6: case 9: case 11:
                gunSayisi = 30;
            case 2:
                if (yil%4 == 0 &&!(yil % 100 == 0 || yil % 400 == 0)){
                gunSayisi = 29;
            }else{
                gunSayisi = 28;
            }
            break;

            default:
                System.out.println("Gecersiz ay");
                break;

        }

        System.out.println("Gun sayisi = " + gunSayisi);




















    }






















}
