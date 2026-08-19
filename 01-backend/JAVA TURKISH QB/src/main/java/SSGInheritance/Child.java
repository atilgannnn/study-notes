package SSGInheritance;

public class Child extends Parent{

    Child(){
        super();//super'dan sonra iki parantez varsa bu constructor oldugunu gosterir.
        System.out.println("Child parametersiz constructor calisti");
    }

    Child(int sayi){
        super(14);//super'dan sonra iki parantez varsa bu constructor oldugunu gosterir.
        System.out.println("Child 1 parametreli constructor calisti");
    }

    Child(int sayi2, int sayi3){
        super(14,15);//super'dan sonra iki parantez varsa bu constructor oldugunu gosterir.
        System.out.println("Child 2 parametreli constructor calisti");
    }




    public static void main(String[] args) {

        Child child = new Child();
        Child child2 = new Child(14);
        Child child3 = new Child(12,15);


    }

}
