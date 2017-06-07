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
    KodeBuah.kodeMelon(312);
    KodeBuah.kodeSemangka(4112);
    
    //Generic method
    Jenisbuah.namaJenis("Megalodon");
    Jenisbuah.jenisRasa("Manis", "Asem");
    
    //hargabuah
    hb.setHargaBuah(12000);
    hb.getHargaBuah();
    System.out.println("Harga buah : " +hb.getHargaBuah() );
    
    pd.hitungHarga();
    }
}