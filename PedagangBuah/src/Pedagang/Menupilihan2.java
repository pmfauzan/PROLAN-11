
package Pedagang;
import buah.Manfaat;
import java.util.Scanner;
public class Menupilihan2 {
    Scanner pilih2 =  new Scanner(System.in);
    int pilihan, berat,harga,total;
    
    protected void pilihBuah2(){
        System.out.println("   Buah setan dari tanah one piece");
        System.out.println("------------------------------------------");
        System.out.println("1. Gomu Gomu no Mi      4. Bara Bara no Mi");
        System.out.println("2. Sube Sube no Mi      5. Toge Toge no Mi");
        System.out.println("3. Kilo Kilo no Mi      6. Supa Supa no Mi");
        System.out.println("------------------------------------------");
        System.out.print("Masukan nomor buah pilihan anda : ");
        pilihan = pilih2.nextInt();
        System.out.print("Masukan banyak buah [Kg]        : ");
        berat = pilih2.nextInt();
        System.out.println("------------------------------------------");
        switch(pilihan){
            case 1:
                System.out.println("Buah yang ada pilih        : Gomu Gomu no Mi");
                buah.Manfaat.manfaatGomu();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 1000000;
                System.out.println("Harga Buah                 :$ "+harga);
                total = harga*berat;
                System.out.println("Total harga                :$ "+total);
                break;
            case 2:
                System.out.println("Buah yang ada pilih        : Sube Sube no Mi");
                buah.Manfaat.manfaatSube();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 15000000;
                System.out.println("Harga Buah                 :$ "+harga);
                total = harga*berat;
                System.out.println("Total harga                :$ "+total);
                break;
            case 3:
                System.out.println("Buah yang ada pilih        : Kilo Kilo no Mi");
                buah.Manfaat.manfaatKilo();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 1200000;
                System.out.println("Harga Buah                 :$ "+harga);
                total = harga*berat;
                System.out.println("Total harga                :$ "+total);
                break;
            case 4:
                System.out.println("Buah yang ada pilih        : Bara Bara no Mi");
                buah.Manfaat.manfaatBara();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 3600000;
                System.out.println("Harga Buah                 :$ "+harga);
                total = harga*berat;
                System.out.println("Total harga                :$ "+total);
                break;
            case 5:
                System.out.println("Buah yang ada pilih        : Toge Toge no Mi");
                buah.Manfaat.manfaatToge();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 2500000;
                System.out.println("Harga Buah                 :$ "+harga);
                total = harga*berat;
                System.out.println("Total harga                :$ "+total);
                break;
            case 6:
                System.out.println("Buah yang ada pilih        : Supa supa no Mi");
                buah.Manfaat.manfaatSupa();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 2000000;
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
