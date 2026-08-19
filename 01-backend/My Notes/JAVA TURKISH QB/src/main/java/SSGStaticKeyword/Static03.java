package SSGStaticKeyword;

public class Static03 {

    String isim;
    int id;
    static String okulIsimi;
    static int counter = 0;

    public int setId(){

        counter++;
        return counter;


    }

    public Static03 (String isim){

        this.isim = isim;
        this.id = setId();


    }

    public static void setOkulIsim(String isim) {

        okulIsimi = isim;

    }

    public void getOgrencininBilgileri(){

        System.out.println("Ogrencinin ID: " +id);
        System.out.println("Ogrencinin ismi: " +isim);
        System.out.println("Okul ismi: " +okulIsimi);


    }

    public static void main(String[] args) {
        Static03.setOkulIsim("Yildiz Okulu");
        Static03 s2 = new Static03("Baris Aslan");
        Static03 s3 = new Static03("Sumeyra Kezban");
        Static03 s4 = new Static03("Atılgan Şahin Ulaşan");
        Static03 s5 = new Static03("Ozlem Haslak");
        Static03 s6 = new Static03("Fatih Kupeli");
        s2.getOgrencininBilgileri();
        s3.getOgrencininBilgileri();
        s4.getOgrencininBilgileri();
        s5.getOgrencininBilgileri();
        s6.getOgrencininBilgileri();

    }


}
