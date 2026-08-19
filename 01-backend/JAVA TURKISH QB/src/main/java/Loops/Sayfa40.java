package Loops;

public class Sayfa40 {

    public static void main(String[] args) {

        /*

        3) Bir String‘in palindrom olup olmadığını kontrol etmek için kod yazınız.
        Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        */

        //1. Yol:

        String kelime = "Kabak";
        String palindrom = "";

        for (int i = kelime.length()-1; i > -1; i--) {
            String idx = kelime.substring(i, i + 1);
            palindrom += idx;
        }if(kelime.equalsIgnoreCase(palindrom)){
            System.out.println("Bu bir palindromdur");
        }else {
            System.out.println("Bu bir palindrom değildir");
        }

        System.out.println();

        //2. Yol:

        String kelime1 = "Kabak";
        String palindrom1 = "";
        int j = kelime1.length()-1;

        while(j>-1){
            String idx1 = kelime1.substring(j,j+1);
            palindrom1 += idx1;
            j--;
        }
        if (kelime1.equalsIgnoreCase(palindrom1)){
            System.out.println("Bu bir palindromdur");
        }else {
            System.out.println("Bu bir palindrom değildir");
        }

        System.out.println();

        //3. Yol:

        String kelime2 = "Kabak";
        String palindrom2 = "";
        int k = kelime2.length()-1;

        do {
            String idx2 = kelime2.substring(k,k+1);
            palindrom2 += idx2;
            k--;
        }while (k>-1);
            if (kelime2.equalsIgnoreCase(palindrom2)){
                System.out.println("Bu bir palindromdur");
            }else {
                System.out.println("Bu bir palindrom değildir");
            }




























    }
























}


