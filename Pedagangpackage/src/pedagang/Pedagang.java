
package pedagang;

import java.util.Scanner;
public class Pedagang extends PedagangAb{
    Scanner input = new Scanner(System.in);
    
    @Override
    public void printNama(){
        System.out.println(getNama());
    }
    public void tampilBuah(){
        System.out.println("Menyediakan berbagai macam jenis buah");
    }
    public void menuPilihan(){
        int pilihan, berat, total;
        System.out.print("Masukan menu pilihan anda : ");
        pilihan = input.nextInt();
        System.out.print("Banyak buah (kg)          : ");
        berat = input.nextInt();
        System.out.println("============================");
        System.out.print("Buah yang dipesan          : ");
        
        switch (pilihan) {
            case 1:
                System.out.println("Semangka Konoha");
                super.tentangSemangka();
                break;
            case 2:
                System.out.println("Melon Otogakure");
                super.tentangMelon();
                break;
            case 3:
                System.out.println("Papaya Kifurai");
                super.tentangPapaya();
                break;
            default:
                System.out.println("Pilihan Buah tidak ditemukan");
                break; //end if
        }
        System.out.println("Banyak buah yang dipesan   : "+berat+ " Kg");
        total = berat *12000;
        System.out.println("Total harga : " + total);
    }
}
