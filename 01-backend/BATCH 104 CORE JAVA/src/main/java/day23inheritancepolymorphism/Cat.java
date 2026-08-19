package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){

        System.out.println("Cat meow");

    }

    @Override
    public void eat() {//@Override annotation'ini kullanarak, Java'nin yaptigimiz Override islemini kontrol etmesini saglariz.
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a,int b){

        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //Asagidaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }


    }

    /*

    1)Override yaparken "method body"si degistirilir.
    2)Override yaparken ASLA method signature (isim ve parametre) degistirilmez.
    3)Override yaparken Inheritance olmak zorundadir.
    4)Override yaparken "Access Modifier"lar belirli kurallara gore farklilastirilabilirler.
      i)"private" methodlar override edilemezler
      ii)Child Class'daki "override edilen" method'un access modifier'i Parent Class'daki
      methodun access modifier'i ile ayni veya daha genis olmalidir.
      NOTE: Child Class'daki method'un access modifier'i daha dar olamaz.
      iii)default method'lar ayni package icindeyse override edilebilirler,
          farkli package'den override edilemezler.
    5)Parent Class'daki methodun "return type" i void ise "return type" degistirilemez.
    6)Parent Class'daki methodun "return type" i primitive ise "return type" degistirilemez.
    7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
    8)Parent Class'daki methodun "return type" i Parent Class ise "return type" child'lardan biri olabilir.
      NOTE: Child Class'daki return type Parent Class'dakinden genis olamaz.
      NOTE: Aralarinda "Parent - Child" iliskisi olmayan Class'lar Overriding'de Return Type degisiminde kullanilamazlar.
      Mesela "Short", "Integer" dan kucuktur,fakat aralarinda "Parent - Child" iliskisi olmadigindan "Integer" yerine "Short" kullanamazsiniz.
      NOTE: Child'daki methodun Return Type'indan Parent'daki methodun Return Type'ina gidiste "IS-A" Relationship olmali.
      NOTE: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
    9)Child<Parent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
             HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
    10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
    "final" method body degistirilmesine musaade etmez.
    11)Polymorphism = Overloading + Overriding'dir.
      NOTE: Polymorphism nedir? Derlerse Overloading ve Overriding'i anlatin.
    12)Overloading ve Overriding arasindaki farklar nelerdir?
       i)Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir.
       ii)"private" method'lar Overload edilebilir, Override edilemezler.
       iii)"final" method'lar Overload edilebilir, Override edilemezler.
       iv)"Overloading" "static polymorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir.
           Cunku "static" method'lar Overload edilebilir, Override edilemezler.
        v)"Overloading" de method signature degisir ama "Overriding" de method signature'a dokunulmaz.
     */



















