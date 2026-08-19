package day22inheritancepolymorphism.day25exceptions;

public class E01 {

    /*

    1)"Exception" (istisnai hata) java kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
    2)Exception'lar ile calismanin iki yolu vardir.
        a)try-catch block kullanma ve exception olussa bile calismayi devam ettirme
        b)throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz
        gerekiyor ise bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanın devam etmesi gerekmez)
    3)Eger exception'i handle etmez isek java calismayi durdurur.
    4)try-catch kullanirken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz
    5)try catch olmaksizin yalniz kullanilamaz
    6)Eger yazmis oldugunuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch blok icine koymalisiniz
    7)catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir.
    8)e.getmessage() methodunu kullanarak teknik mesajlar elde edebiliriz.
        System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
        printStackTrace(); methodu exception ile ilgili detaylica teknik mesaj verir.Kod calismaya devam eder.
        System.err.println();(burasi renkli) methodu hata mesajini rekli olarak verir. Bu sayede konsolda diger mesajlardan ayirmak icin kullaniriz.
    9)Eger try body icerisindeki kod sorunsuz calisirsa catch block devreye girmez.

    */


    public static void main(String[] args) {

       // divide(6,2);//3
       // divide(0,2);//0
       // divide(6,0);//Matematikte bir sayi 0 ile bolunemez (Arithmetic Exception)

        divide2(5,0);
        divide2(3,0);
        divide2(12,0);


    }


    //1. Yol (Tavsiye Edilmez)
    //Bir developer icin tum matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide (int a, int b){
        if(b==0){

            System.out.println("Bir sayi sifir ile bolunemez");

        }else {

            System.out.println(a/b);


        }

    }

    //2. Yol (Try-Catch kullanarak exception'ı handle etmek tavsiye edilir.
    public static void divide2(int a,int b){

        try{
            System.out.println(a/b);
            System.out.println("hi exceptions");
            System.out.println("bye exceptions");
        }catch(ArithmeticException e){

            System.out.println("Bolme isleminde bir problem olustu ==> " +e.getMessage());
            e.printStackTrace();
            System.err.println("Bolme isleminde bir problem olustu");

        }

        //Java matematik ile ilgili karsılasilmasi muhtemel tum istisnalari,hatalari ArithmeticException class'ina koymustur.
        //Matematikteki tum istisnalari detaylari bilmek zorunda degiliz.



    }

}
