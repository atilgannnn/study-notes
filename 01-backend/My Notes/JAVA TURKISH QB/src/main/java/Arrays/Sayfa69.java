package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sayfa69 {

    public static void main(String[] args) {

        /*


        12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.


        */

        Scanner input = new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz");;//Array'e uzunluk verdik
        int arrUzunluk = input.nextInt();

        int[] arr = new int[arrUzunluk];

        System.out.println("Girilen array elemanlari: " +arrUzunluk);//Scanner ile elemanlari kullanicidan aldik
        for (int i = 0; i < arrUzunluk; i++) {

            arr[i] += input.nextInt();//Scanner ile elemanlari tek tek ekledik
            
        }
        System.out.println(Arrays.toString(arr));//Array'i kullanici giris sirasina gore alınan elemanlar halinde yazdirdik

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//Array'i sort ettik

        int buyukKucukfarki = arr[arr.length-1] - arr[0];//Buyuk ve kucuk eleman arasindaki farki aldik
        System.out.println("En buyuk ve en kucuk eleman arasindaki fark: " + buyukKucukfarki);






    }


}
