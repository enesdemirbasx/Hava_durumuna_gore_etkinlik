import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        Scanner inp=new Scanner(System.in);
        int hava;
        System.out.print("Hava sıcaklığını giriniz(Lütfen tam sayı giriniz): ");
        hava= inp.nextInt();
        
        if (hava<6){
            System.out.print("Kayak yapmak için harika bir hava :)");  
        } else if (hava<16) {
            System.out.print("Sinema için harika bir hava :)");
        } else if (hava<26) {
            System.out.print("Piknik için harika bir hava :)");
        } else {
            System.out.print("Yüzmek için harika bir hava :)");
        }
    }
}