package day09_nestedforloop;

public class C04_DoWhileLoop {


    public static void main(String[] args) {

            /*
            Adada yalnız bir maymun var
            Her gün 4 muz yemesi gerekiyor
            o adada sadece 165 muz var
            Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
            Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
            int MuzSayısı =165, hayatta kalmaDays = 0;
            boolean maymunAlive = true;
            */


            //Maymunun kac gun hayatta kalacagini gosteren kod
            //Hayatta kaldigi surece muz vermelisin(DO While)
            //Eger 4 ten az muz kalirsa maymunlar olur

            boolean maymunAlive = true;
            int muzSayisi =165;
            int survivalDays = 1;

            do {
                muzSayisi -=4;//her gun 4 muz eksiltir
                survivalDays++;

                        if(muzSayisi<4) {
                            maymunAlive=false;
                            System.out.println("Bugün " + survivalDays + " gun yasayamadi muz kalmadi.Maymun oldu");
                        }else System.out.println("Bugün "+survivalDays+" gun yasadi muz bitmedi.Maymun hayatta");

            }while (maymunAlive);
        System.out.println("Toplam maymunun yasadigi gun sayisi " + (survivalDays-1));


























    }


























}
