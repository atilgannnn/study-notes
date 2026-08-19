package day13_overridingoverloadingstatickeywords;

public class C02_Overloading {

    public static void main(String[] args) {

        //Ayni Classta ayni isimde method olusturmak icin method signature degistirilir.

        cikarma(98,(float)52.666);

        cikarma(14.5,3);

        toplama(55,66);

        toplama(2.3,4.5);

        carpma(2,3);

        carpma(8.9,32);


    }

    //data type'lari degistirilerek overloading yapildi

    private static void carpma(double v, int i) {

        System.out.println("double ile integer carpma yapildi " +(v*i));

    }

    private static void carpma(int i, int i1) {

        System.out.println("Iki int deger carpma yapildi " +(i*i1));

    }

    private static void toplama(double v, double v1) {

        System.out.println("Iki double deger toplandi " + (v+v1));

    }

    private static void toplama(int i, int i1) {

        System.out.println("Iki int deger toplandi " +(i+i1));

    }



    private static void cikarma(double v, int i) {

        System.out.println("Double bir deger ile Float cikarma yontemi " +(i-v));

    }

    private static void cikarma(int i, float v) {

        System.out.println("Integer bir deger ile Float cikarma yontemi" +(v-i));

    }

    //Parametrelerin sayisi arttirilarak yapilan overloading

    private static void toplama(double v, double v1,double v2) {

        System.out.println("uc double deger toplandi " + (v+v1+v2));

    }

    private static void toplama(double v, double v1,double v2,double v3) {

        System.out.println("dort double deger toplandi " + (v+v1+v2+v3));

    }

    //data turleri farkli oldugunda parametrelerin yerini degistirerek overloading yapabiliriz
    private static void toplama(Float a, double b) {

        System.out.println("Ilki double ikincisi int deger ile carpma yapildi " +(a*b));

    }




}
