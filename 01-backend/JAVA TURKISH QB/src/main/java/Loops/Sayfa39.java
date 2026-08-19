package Loops;

public class Sayfa39 {

    public static void main(String[] args) {

      /*

      2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız. Örneğin; accessories  ́ ces

      */
        
        //1. Yol:
        String a = "accessories";
        String b = "";
        for (int i = 0; i <a.length() ; i++){
            String c = a.substring(i,i+1);
            if (a.indexOf(c) != a.lastIndexOf(c)){
                if (!b.contains(c)){
                    b+=c;
                }

            }
            
        }
        System.out.println(b);

        System.out.println();

        //2. Yol:

        String a1 = "accessories";
        String b1 = "";
        int j = 0;
        while(j<a1.length()){
            String c1 = a1.substring(j,j+1);
            if (a1.indexOf(c1) != a1.lastIndexOf(c1)){
                if(!b1.contains(c1)){
                    b1+=c1;
                }
            }
            j++;
        }
        System.out.println(b1);

        System.out.println();

        //3. Yol:

        String a2 = "accessories";
        String b2 = "";
        int k = 0;
        do {
            String c2 = a2.substring(k,k+1);
            if (a2.indexOf(c2) != a2.lastIndexOf(c2)){
                if (!b2.contains(c2)){
                    b2+=c2;
                }
            }
            k++;
        }while(k<a2.length());
        System.out.println(b2);


























    }






















}
