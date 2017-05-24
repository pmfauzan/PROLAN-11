
public class Pedagangmain {

    public static void main(String args[]){
    Pedagang pd = new Pedagang();
    Hargabuah hb = new Hargabuah();
    Buah bh = new Buah();
    //buah
    bh.printNama();
    //pedagang
    pd.tampilBuah();
    //hargabuah
    hb.setHargaBuah(12000);
    hb.getHargaBuah();
    System.out.println("Harga buah : " +hb.getHargaBuah() );
    
    pd.hitungHarga();
    }
}