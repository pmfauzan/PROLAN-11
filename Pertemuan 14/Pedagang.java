import java.util.Scanner;
public class Pedagang extends Buah{
    Scanner input = new Scanner(System.in);
    
    public void tampilBuah(){
        System.out.println("Menyediakan berbagai macam buah");
        super.namaBuah();
    }
    public void hitungHarga(){
        int pilihan;
        int berat;
        int total;
        System.out.print("Masukan menu pilihan anda : ");
        pilihan = input.nextInt();
        System.out.print("Banyak buah (kg)          : ");
        berat = input.nextInt();
        System.out.println("============================");
        System.out.print("Buah yang dipesan          : ");
    //function if
        if (pilihan == 1){
        System.out.println("Semangka Konoha");
        super.tentangSemangka();
        }else if(pilihan == 2){
        System.out.println("Melon Otogakure");
        super.tentangMelon();
        }else if(pilihan == 3){
        System.out.println("Papaya Kifurai");
        }else{
        System.out.println("Pilihan Buah tidak ditemukan");
        } //end if
        System.out.println("Banyak buah yang dipesan   : "+berat+ " Kg");
        total = berat *12000;
        System.out.println("Total harga : " + total);
    }
    
    
}
