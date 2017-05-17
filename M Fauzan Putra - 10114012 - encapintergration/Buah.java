public class Buah extends Hargabuah{
  public void namaBuah(){
    System.out.println("1. Semangka Konoha");
    System.out.println("2. Leci Qwaser");
    System.out.println("3. Alpukat Dinding Maria");
  }
  public void aturan(){
    System.out.println("Dilarang kasbon");
  }
  public void harga(){
    super.setHargaBuah(20000);
  }
}
