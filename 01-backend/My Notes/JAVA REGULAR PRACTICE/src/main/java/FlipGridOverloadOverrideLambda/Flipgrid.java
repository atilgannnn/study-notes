package src.main.java.FlipGridOverloadOverrideLambda;

import java.util.Scanner;

public class Flipgrid {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight");
        double weight = input.nextDouble();
        System.out.println("Please enter your height");
        double height = input.nextDouble();

        double bodyMassIdx = weight/(height*height);
        if (bodyMassIdx<18.5 && bodyMassIdx>0) {

            System.out.println("You are weak!");

        }else if(bodyMassIdx>18 && bodyMassIdx<25){

            System.out.println("Your weight is ideal!");

        }else if(bodyMassIdx>=25 && bodyMassIdx<30){

            System.out.println("You are fat!");

        }else if (bodyMassIdx>=30) {

            System.out.println("Obese");

        }else{

            System.out.println("Invalid Value");

        }

       


    }


}
