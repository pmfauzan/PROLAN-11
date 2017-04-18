import java.util.Scanner;
//Class pedagang //sebagai kelas anak
//inheritance
class Pedagang extends Buah{
  //Scanner
  Scanner input = new Scanner (System.in);
  //var
  String nama;
  public Pedagang(){
    nama = "   copyright : Asanka Putra   ";
  }//end Namapedagang

  public void Namatoko(){
    System.out.println("       Toko buah Asanka       ");
	System.out.println("----------------------------------");

  } //end void Namatoko

  //Override
  public void Tampilbuah(){
    System.out.println("Menyediakan berbagai jenis buah dari negara ninja");
    //penggunaan super
    super.Namabuah(); //pemanggilan void dari class Buah
  }//end void Tampilbuah
  
  //Override
  public void aturan(){
    System.out.println("             Peraturan pembelian       ");
    System.out.println("buah yang sudah dibeli tidak dapat ditukar dengan buah lain");
    System.out.println("tidak menerima barter buah");
    super.peraturan(); //pemanggilan void dari class Buah
  }//end void aturan
  
  //Override
  public void pesanbuah(){
    int pilihan;
    int berat;
	int total;
	super.harga(); //super harga
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
	total = berat * super.harga();
	System.out.println("Harga                      : Rp. "+total);
  }//end void pesanbuah
} //end class Pedagang
