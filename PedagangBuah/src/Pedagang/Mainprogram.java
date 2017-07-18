
package Pedagang;
import java.util.Scanner;
public class Mainprogram {
    Scanner input = new Scanner(System.in);
    public static void main (String args[]){
        Pedagangnama pn = new Pedagangnama();
        pn.namaToko();
        Kodetoko.tampilKode();
        Mainprogram mp = new Mainprogram();
        mp.menupilihan();
       
    }
    
   public void menupilihan(){
       int pilihan;
       String ulang = "y";
       Menupilihan1 mp1 = new Menupilihan1();
       Menupilihan2 mp2 = new Menupilihan2();
       Menupilihan3 mp3 = new Menupilihan3();
       InfoToko it = new InfoToko();
       while(ulang.equals("y")){
         System.out.println("Selamat datang di menu pilihan buah toko buah kami");
         System.out.println("Silahkan pilih menu buah yang akan anda pilih");
         System.out.println("--------------------------------------------------");
         System.out.println("1. Buah Manusia");
         System.out.println("2. Buah Setan");
         System.out.println("3. Buah dewa");
         System.out.println("4. Info toko");
         System.out.println("5. Keluar");
         System.out.println("--------------------------------------------------");
         System.out.print("Masukan menu pilihan anda : ");
         pilihan = input.nextInt();
         switch(pilihan){
             case 1:
                mp1.pilihBuah1();
                 break;
             case 2:
                 mp2.pilihBuah2();
                 break;
             case 3:
                 mp3.pilihBuah3();
                 break;
             case 4:
                 it.setNamatoko("Toko ini berdiri sejak tahun 2017");
                 System.out.println(it.getInfotoko());
                 System.out.println("Dibuat untuk memenuhi salah satu tugas mata kuliah prolan");
                 break;
             case 5:
                 break;
             default:
                 System.out.println("Menu yang anda pilih tidak ada!");
                 break;
        }
           System.out.println("--------------------------------------------------");
           System.out.print("Ingin memilih lagi ? [y/t] :");
           ulang = input.next();
       }
        }
   
}
