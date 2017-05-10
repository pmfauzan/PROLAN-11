import java.util.Scanner;
public class Pedagang extends Buah{
  //Scanner
  Scanner input=new Scanner(System.in);

  public void namaToko(){
    System.out.println("       Toko buah Asanka       ");
	  System.out.println("----------------------------------");
  }//end void namaToko
  protected void namaBuah(){
    System.out.println("Menyediakan berbagai macam buah");
  	System.out.println("1. Semangka Konoha");
    System.out.println("2. Leci Otogakure");
    System.out.println("3. Alpukat Sunagakure");
  	System.out.println("----------------------------------");
  }//end void namaBuah
  protected void aturan(){
    System.out.println("        Peraturan pembelian       ");
    System.out.println("buah yang sudah dibeli tidak dapat ditukar dengan buah lain");
    System.out.println("tidak menerima barter buah");
  }//end void aturan
  protected void keterangan(){
    System.out.println("Buah di toko kami selalu segar!");
  }//end void keterangan
  protected void harga(){
    System.out.println("Harga buah ditoko kami : 15K/ kg");
  }//end void harga
  protected void pesanBuah(){
  int pilihan;
  int berat;
	int total;
	int harga = 15000;
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
  }//end void harga

}//end class Pedagang
