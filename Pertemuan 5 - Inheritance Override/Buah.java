public class Buah{
  //Var
  int Stok;

  public void Namabuah(){
    System.out.println("-----------------------");
    System.out.println("   Menyediakan Buah    ");
    System.out.println("-----------------------");
    System.out.println("Durian Konoha");
  }
  public void Tampilbuah(){
    System.out.println("Apel Hokage pertama");
    System.out.println("=======================");
  }

  //Konstruktor
  Buah(int Stok){
    this.Stok = Stok;
  }
  public void Stokbuah(){
    System.out.println("Stok Buah : "+Stok);
  }

} //End
