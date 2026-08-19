package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*


    - Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
    - Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
    - LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
    - Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
    yerine "Node" kelimesini kullanmak yerinde olacaktir.
    - Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
    - Her pointer bir elemani gostermektedir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

    NOTE: LinkedList eleman ekleme ve eleman silmede cok basarilidir.
    Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

    NOTE: ArrayList eleman bulma işlemlerinde (search) çok başarılıdır.
    Ancak  LinkedList eleman bulma (search) işlemlerinde başarısızdır.

    ==> Çok fazla arama işlemi yapılacağında "ArrayList" kullanmalısınız.
    ==> Çok fazla eleman ekleme işlemi yapılacaksa "LinkedList" kullanmalısınız.

    1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
    2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
    3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
    4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
    5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
    6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
    7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.

    */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Jolie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");



        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //LinkedList'ler ekleme ve silme islemlerinde cok basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        String firstEl = visitors.pop();// Cut + Paste ==> Command + X
        System.out.println(firstEl);//Tom
        System.out.println(visitors);//[Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList <String> myList = new LinkedList<>();
        //myList.pop();//NoSuchElementException atti cunku LinkedList bos







    }



}
