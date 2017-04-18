//class Buah //Sebagai kelas bapak
class Buah{
  public void Namabuah(){
	System.out.println("----------------------------------");
	System.out.println("1. Semangka Konoha");
    System.out.println("2. Leci Otogakure");
    System.out.println("3. Alpukat Sunagakure");
	System.out.println("----------------------------------");
  } //end void Namabuah
  public void peraturan(){
    System.out.println("Dilarang kasbon");
  }//end void peraturan
  public void keterangan(String ket){
    System.out.println(ket);
  }//end void keterangan
  public void keterangan(String ket1, String ket2){
    System.out.println(ket1+ket2);
  }//end void keterangan
  public int harga(){
    return 15000;
  }//end harga
  
} //end class Buah
