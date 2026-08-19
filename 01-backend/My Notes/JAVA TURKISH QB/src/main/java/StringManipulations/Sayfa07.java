package StringManipulations;

public class Sayfa07 {

    public static void main(String[] args) {

        /*

        1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun.
        Şehir ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
        Örnek: mIAMI - Miami miami - Miami MIAMI - Miami
        mIaMi - Miami vb.

         */

        String sehirIsmi = "pArIs";
        String konsolSehirIsmi = sehirIsmi.trim().toLowerCase();
        konsolSehirIsmi = konsolSehirIsmi.substring(0,1).toUpperCase()+konsolSehirIsmi.substring(1);
        System.out.println(konsolSehirIsmi);

        //Uppercase yaptıktan sonra neden bir daha substring() koyuyoruz?

        /*

        2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

         */

        String name1 = "Ali Can";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";

        Integer newName1 = name1.replaceAll("\\s","").length();
        Integer newName2 = name2.replaceAll("\\s","").length();
        Integer newName3 = name3.replaceAll("\\s","").length();

        System.out.println(newName1+newName2+newName3);

        /*

        3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

         */

        String code = " Miami 33018!!! ";

        Integer code1 = code.replaceAll("\\s","").replaceAll("\\p{Punct}","").length();

        System.out.println(code1);

































    }

























}
