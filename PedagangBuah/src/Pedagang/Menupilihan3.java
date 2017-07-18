
package Pedagang;
import java.util.Scanner;
public class Menupilihan3 {
    Scanner pilih3 = new Scanner(System.in);
    
    protected void pilihBuah3(){
        int pilih, berat, harga, total;
        System.out.println("      Buah Dewa dari tanah Oregairuk");
        System.out.println("              God Of Highschool");
        System.out.println("------------------------------------------");
        System.out.println("1. Buah Illahi");
        System.out.println("------------------------------------------");
        System.out.print("Masukan pilihan anda      : ");
        pilih = pilih3.nextInt();
        System.out.print("Masukan banyak buah [kg]  : ");
        berat = pilih3.nextInt();
        System.out.println("------------------------------------------");
        switch(pilih){
            case 1:
                System.out.println("Buah yang ada pilih        : Buah Illahi");
                buah.Manfaat.manfaatBuahIlahi();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 10000000;
                System.out.println("Harga Buah                 :$ "+harga);
                total = harga*berat;
                System.out.println("Total harga                :$ "+total);
            break;
            default:
                System.out.println("Buah yang anda pilih tidak ada");
                break;
        }
    }
    
}
