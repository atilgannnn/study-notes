package StringManipulations;

public class Sayfa10 {

    public static void main(String[] args) {

        /*

        10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.

        Örnek: ‘Ali   Can’ için konsolda false yazmalıdır.
                'Ali Can ’ için konsolda false yazmalıdır.
                ' Ali Can ’ için konsolda false yazmalıdır.
                ‘Ali Can’ için konsolda true yazmalıdır.

         */

        String isim = "Ali Can";

        String isim1 = isim.trim();

        String isim2 = isim1.replaceAll("\\s","");

        Boolean boslukVarMi = isim1.length() - isim2.length() == 1;

        System.out.println(boslukVarMi);


        /*

        11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
        Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
                ‘Ali’ için kodunuz konsolda true yazmalıdır

         */

        String name = "Agatha";

        String name1 = name.trim().replaceAll("\\s","");

        boolean name2 = name1.length()>6;
        System.out.println(name2);

        /*

        12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
        Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        ‘ALI.’ için kodunuz konsolda true yazdırmalıdır

         */

        String namen = "Avatar.";

        String namen1 = namen.trim().replaceAll("[^a-zA-Z]","").substring(0,1).toUpperCase() + namen.substring(1).toLowerCase();
        

        System.out.println(namen1);

        //BU SORUYA GERİ DÖN!!!
































    }























}
