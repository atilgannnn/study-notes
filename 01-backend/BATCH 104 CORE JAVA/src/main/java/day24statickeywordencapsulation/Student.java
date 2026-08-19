package day24statickeywordencapsulation;


        //Encapsulation : "Data Hiding(Data Gizlemek)" demektir.
        //Data'yi niicn gizlersiniz? Data'yi dıs etkenlerden korumak icin.
        //Data'yi nasil gizlersin? Access Modifier'ini "private" yaparak gizlerim.
        //Data'yi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?
        //"get method"lar (getter) olusturarak gizledigimiz data'lari okunur hale getirebiliriz.
        //Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
        //"set method"lar (setter) olusturarak gizledigimiz data'lari degistirebiliriz.
        //Variable'in "data type"i ile get method'un "return type"i ayni olmalidir.
        //get method'lari isimlendirirken "get + <variable name>" ancak variable'in data type'i "boolean" ise "is + <variable name>" yapariz.

public class Student {

    public String stdName = "Tom Hanks";
    private String sdtId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getSdtId() {
        return sdtId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setSdtId(String sdtId) {
        this.sdtId = sdtId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
