package day07_stringmanipulations;

import java.util.Scanner;

public class C08_StringManipulations {

    public static void main(String[] args) {


        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        // @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email = input.nextLine();
        String arananMetin = "@gmail.com";
        
        if (!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kaydedildi");
            
        }else System.out.println("Lutfen yazimi kontrol edin");


    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
