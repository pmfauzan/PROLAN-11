package Pedagang;
import java.util.Scanner;
import buah.Manfaat;
public class Menupilihan1 {
    Scanner input = new Scanner(System.in);
    public void pilihBuah1(){
        //var
        int pilihan,berat,total,harga;
        
        System.out.println("\f");
        System.out.println("          Buah-buahan segar");
        System.out.println("       dari kebunnya langsung");
        System.out.println("------------------------------------");
        System.out.println("1. Apel     3. Jeruk    5. Alpukat");
        System.out.println("2. Mangga   4. Durian   6. Buah naga");
        System.out.println("------------------------------------");
        System.out.print("Masukan buah pilihan anda : ");
        pilihan= input.nextInt();
        System.out.print("Masukan banyak buah [Kg]  : ");
        berat= input.nextInt();
        System.out.println("------------------------------------");
        switch(pilihan){
            case 1:
                System.out.println("Buah yang ada pilih        : Apel");
                buah.Manfaat.manfaatApel();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 15000;
                System.out.println("Harga Buah                 :Rp."+harga);
                total = harga*berat;
                System.out.println("Total harga                :Rp."+total);
                break;
            case 2:
                System.out.println("Buah yang ada pilih        : Mangga");
                buah.Manfaat.manfaatMangga();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 15000;
                System.out.println("Harga Buah                 :Rp."+harga);
                total = harga*berat;
                System.out.println("Total harga                :Rp."+total);
                break;
            case 3:
                System.out.println("Buah yang ada pilih        : Jeruk");
                buah.Manfaat.manfaatJeruk();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 10000;
                System.out.println("Harga Buah                 :Rp."+harga);
                total = harga*berat;
                System.out.println("Total harga                :Rp."+total);
                break;
            case 4:
                System.out.println("Buah yang ada pilih        : Durian");
                buah.Manfaat.manfaatDurian();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 36000;
                System.out.println("Harga Buah                 :Rp."+harga);
                total = harga*berat;
                System.out.println("Total harga                :Rp."+total);
                break;
            case 5:
                System.out.println("Buah yang ada pilih        : Alpukat");
                buah.Manfaat.manfaatAlpukat();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 15000;
                System.out.println("Harga Buah                 :Rp."+harga);
                total = harga*berat;
                System.out.println("Total harga                :Rp."+total);
                break;
            case 6:
                System.out.println("Buah yang ada pilih        : Buah Naga");
                buah.Manfaat.manfaatNaga();
                System.out.println("Banyak buah yang ada pesan : "+berat+" Kg");
                harga = 20000;
                System.out.println("Harga Buah                 :Rp."+harga);
                total = harga*berat;
                System.out.println("Total harga                :Rp."+total);
                break;
            default:
                System.out.println("Buah yang anda pilih tidak ada");
                break;
        }
    }
    
}
