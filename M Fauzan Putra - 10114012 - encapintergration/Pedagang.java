import java.util.Scanner;
public class Pedagang extends Buah{
  Scanner input = new Scanner (System.in);
  public void namaToko(){
    System.out.println("Toko Buah Asanka");
    System.out.println("----------------");
  }
  public void tampilBuah(){
    super.namaBuah();
  }
  public void pesanBuah(){
    int pilihan;
    int berat;
    int total;
    int harga = 20000;
      System.out.println("----------------------------------");
      System.out.print("Masukan buah pilihan anda : ");
      pilihan = input.nextInt();
      System.out.print("Banyak buah (kg)          : ");
      berat = input.nextInt();
      System.out.println("==================================");
      System.out.print("Buah yang dipesan          : ");
      //function if
      if (pilihan == 1){
        System.out.println("Semangka Konoha");
      }else if(pilihan == 2){
        System.out.println("Leci Otogakure");
      }else if(pilihan == 3){
        System.out.println("Alpukat Sunagakure");
      }else{
        System.out.println("Pilihan Buah tidak ditemukan");
      } //end if
      System.out.println("Banyak buah yang dipesan   : "+berat+ " Kg");
      total = berat * harga;
      System.out.println("Harga                      : Rp. "+total);
  }
}
