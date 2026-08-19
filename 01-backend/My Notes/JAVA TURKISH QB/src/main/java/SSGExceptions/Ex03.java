package SSGExceptions;

public class Ex03 {

    public static void main(String[] args) {
        String s="merhaba";
        int x=20;
        int y=1;
        try {
            System.out.println(x/y);
            System.out.println(s.charAt(3));
        }catch (ArithmeticException e){
            System.out.println("siz bir sayi 0 'a bolazsiniz"+e.getMessage());

        }catch (StringIndexOutOfBoundsException  e){
            System.out.println(" girlin index Strign da yok" +e.getMessage());
        }finally {
            System.out.println("butunu exceptionlar hatasi hel oldu");
        }

    }

}
