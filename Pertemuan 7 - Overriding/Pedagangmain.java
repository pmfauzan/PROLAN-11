public class Pedagangmain{
  public static void main (String args[]){
    Pedagang Asanka = new Pedagang();
    //pemanggilan konstruktor
    System.out.println(Asanka.nama);
    Buah method = new Buah();
    Asanka.Namatoko();
    Asanka.Tampilbuah();
	Asanka.aturan();
    //method
    method.keterangan("Nekat kasbon, bayar 2x lipat");
    method.keterangan("Harga dan rasa", " Berbanding lurus");
	System.out.print("Harga /Kg : "); System.out.println(method.harga());
    Asanka.pesanbuah();
  } //end static void main

}
