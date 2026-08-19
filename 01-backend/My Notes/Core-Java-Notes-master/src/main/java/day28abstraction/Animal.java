package day28abstraction;

public abstract class Animal {


    //body'si olmayan methodlar abstract method olarak adlandirilir
    //Bir method'u abstract yapmak icin; i)Method body'i sil ii)"abstract" keyword kullan
    //"abstract" methodlar "abstract class" icinde olmalidir.
    public abstract void eat();

    //"abstract class" larda hem "abstract" hem de "concrete(non-abstract)" method kullanılabilir.
    public void drink(){
        System.out.println("Animal drink...");
    }

    //abstract "move" method olusturunuz

    public abstract void move();

}
