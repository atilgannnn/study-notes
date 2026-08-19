package day12_localdatetimevarargsoverloadingoverriding;

public class C03_Varargs {

    public static void main(String[] args) {

        //Verilen Stringleri birlestiren concat() isimli bir method olusturunuz

        concat("Safran","bolu","evleri","cok","guzel");



    }

    private static void concat(String ...str) {

        String sonuc = "";
        for(String w : str){
            sonuc+=w;
        }
        System.out.println(sonuc);
    }


}
