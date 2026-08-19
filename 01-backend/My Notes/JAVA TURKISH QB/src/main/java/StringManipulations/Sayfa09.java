package StringManipulations;

public class Sayfa09 {

    public static void main(String[] args) {


        /*

            7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda yazdırınız.
            Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

         */

        String isim = "Java";

        String geriKalan = isim.substring(1);

        System.out.println(geriKalan);

        /*

            8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda büyük harfle yazdırınız.
            Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.


         */

        String ifade = "Ali Can Yaman";

        String ifade2 = ifade.substring(0,12).toUpperCase();

        System.out.println(ifade2);


        /*

            9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
            Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

         */

        String kelime = "Avatar";
        String kelime2 = kelime.substring(1,5).toUpperCase();

        System.out.println(kelime2);




























    }

























}
