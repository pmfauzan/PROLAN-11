public class Pedagangmain {

    public static void main(String args[]){
    Pedagang pd = new Pedagang();
    Hargabuah hb = new Hargabuah();
    Buah bh = new Buah();
    KodeBuah<String> kb = new KodeBuah<>();
    KodeBuah<Integer> kbi = new KodeBuah<>();
    //buah
    bh.printNama();
    //pedagang
    pd.tampilBuah();
    //Kode Buah
    kb.setKode("1412 A");
    System.out.println(kb.getKode());
    kbi.setKode(12000);
    System.out.println(kbi.getKode());
    //hargabuah
    hb.setHargaBuah(12000);
    hb.getHargaBuah();
    System.out.println("Harga buah : " +hb.getHargaBuah() );
    
    pd.hitungHarga();
    }
}