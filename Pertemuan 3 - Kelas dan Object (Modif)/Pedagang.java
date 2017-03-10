import java.util.Scanner;
class Pedagang{
  Scanner input = new Scanner (System.in);
  void NamaToko(){
    String Nama ="          TOKO BUAH ASANKA          ";
    System.out.println(Nama);
    System.out.println("====================================");
    System.out.println("Selamat datang di toko buah kami");
    System.out.println("Silahkan pilih buah yang kalian suka");
    System.out.println("------------------------------------");
  }
  void Stokbarang(){
    int maxstok = 50;
    int minstok = 0;
    System.out.println("Stok buah saat ini : "+ maxstok +"Kg");
  }
  void hargajual(){
    System.out.println("Harga /Kilo        : Rp 15.000");

  }
  void hitung(){
    int Harga = 15000;
    int Jumlah;
    int banyakbarang;
    System.out.print("Banyak buah yang ingin dibeli [kg]              : ");
  	banyakbarang = input.nextInt();

    Jumlah = Harga * banyakbarang;
    System.out.println("Total harga                                     :Rp. " +Jumlah);

  }
}
