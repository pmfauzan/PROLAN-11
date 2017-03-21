public class Pedagang extends Buah{
  public void Namatoko(){
    System.out.println("-----------------------");
    System.out.println("   Toko Buah Boruto    ");
  }
  //Penggunaan Super
  public void Tampilbuah(){
    System.out.println("Semangka Kazekage");
  }
  public void Buahsuper(){
    Tampilbuah();
    super.Tampilbuah();
  }
  //Super oada Konstruktor
  public Pedagang(int Stokbuah){
    super(Stokbuah);
  }
  //Main
  public static void main(String[]args){
      Pedagang Boruto = new Pedagang(500);
      Boruto.Namatoko();
      Boruto.Namabuah();
      Boruto.Buahsuper();
      Boruto.Stokbuah();
  }

}
