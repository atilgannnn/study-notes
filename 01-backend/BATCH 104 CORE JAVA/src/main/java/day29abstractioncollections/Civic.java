package day29abstractioncollections;

        /*

        "abstract method" lar sadece ne yapilacagini soyler. (what to do)
        "concrete method" lar ne yapilacagi (what to do) ile birlikte nasil yapilacagini da soyler. (how to do)

        "interface" ler bir yapilacak isler listesidir. (To do list)

        "multiple parent interface" kullandiginizda aynı method ismi ile birden fazla method olusturursaniz bu methodlarin
        return type'lari ayni olmalidir. Aksi takdirde hata verir.

        "interface" lerde constructor olmadigi icin interface'lerden obje olusturulamaz.
        "abstract class" larda class olduklari icin constructor vardir ama constructor'lar "abstract class" larda object olusturamazlar.

        Soru: "Abstract Class" ile "Interface" in farki nedir?

        1) Method:
            "Abstract Class" hem abstract hem de concrete methodlar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static keyword"ler kullanarak concrete method'lar olusturabiliriz.

        2) Variable:
           "Abstract Class" larda normal classlarda oldugu gibi her turlu variable olusturulabilir.
           "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

        3) Inheritance:
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezler.
            "Interface" ler ise multiple inheritance'i desteklerler.

        4) Object Creation:
           "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
           "Interface" lerde ise constructor olmadigindan object olusturulamaz.


        Soru: Object-Oriented Programming Language prensipleri nelerdir?
              i) Inheritance    ii) Polymorphism    iii) Encapsulation  iv) Abstraction


        */

public class Civic implements Engine,Ac{
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}
