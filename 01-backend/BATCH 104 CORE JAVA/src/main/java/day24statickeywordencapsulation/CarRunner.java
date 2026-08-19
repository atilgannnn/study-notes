package day24statickeywordencapsulation;

public class CarRunner {

                /*

                           "static keyword" nedir?
                static keyword class'a baglanmis class elemanlaridir
                static class elemanlari butun Object'lerin ortak elamanidir.
                static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
                static Class elemanlarina Class uzerinden ulasilir.

                */

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //Static keyword demek Class'lara baglanmis variable ve methodlardir.
        //Static keyword'e baglanmıs Class elemanlari her object'in ortak elemanidir.
        //Static'lerin uzerinde yapilan her degisiklik butun objeler tarafindan gorulur ve butun objeler etkilenir
        //Static variable'lara object'leri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(Car.counter);
        //Static variable'lara class ismi kullanarak ulasilmalidir
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);




    }


}
