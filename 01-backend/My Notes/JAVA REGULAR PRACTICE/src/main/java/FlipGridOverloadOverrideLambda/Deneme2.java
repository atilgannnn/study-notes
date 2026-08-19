package src.main.java.FlipGridOverloadOverrideLambda;

public class Deneme2 {

    public static void main(String[] args) {

        Dog puppy = new Dog();
        System.out.println(puppy.hareket());
        Snake snake = new Snake();
        System.out.println(snake.hareket());


    }

}

class Animal{

    public String hareket(){

        return "hareket ederim";

    }

}

class Dog extends Animal {

    public String hareket(){

        return "koşarım";

    }

}

class Snake extends Animal {



}

