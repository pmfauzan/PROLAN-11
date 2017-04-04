public class Pedagang extends Buah{
  public void Namatoko(){
    System.out.println("-----------------------");
    System.out.println("   Toko Buah Boruto    ");
  }

  public void Tampilbuah(){
    System.out.println("Semangka Kazekage");
  }
  //Penggunaan Super
  public void Buahsuper(){
    Tampilbuah();
    super.Tampilbuah();
  }
  //Super pada Konstruktor
  public Pedagang(int Stokbuah){
    super(Stokbuah);
  }
  @override
  public void namabuah2(){
    System.out.println("Melon Uzumaki boruto");
    super.Tampilbuah();
  }
  public Semangka(int Stok){
    super(Stok);
    System.out.println(Stok);
  }
  //Main
  public static void main(String[]args){
      Pedagang Boruto = new Pedagang(500);
      Boruto.Namatoko();
      Boruto.Namabuah();
      Boruto.namabuah2();
      Boruto.Buahsuper();
      Boruto.Stokbuah();
      Boruto.Semangka(500);
  }

}
