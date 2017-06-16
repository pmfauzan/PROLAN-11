
package pedagang;
import buah.KodeBuah;
import buah.Jenisbuah;
import buah.Buah;
public class Pedagangmain {
    public static void main (String args[]){
        Pedagang pd = new Pedagang();
        buah.Hargabuah hb = new buah.Hargabuah();
        buah.Buah bh = new buah.Buah();
        pd.printNama();
        pd.tampilBuah();
        bh.namaBuah();
        
        buah.KodeBuah.kodeSemangka(2112);
        buah.KodeBuah.kodeMelon(1412);
        
        buah.Jenisbuah.namaJenis("Buah biasa");
        buah.Jenisbuah.jenisRasa("Manis", "Masam");
        
        hb.setHargaBuah(12000);
        System.out.println("Harga Buah : "+hb.getHargaBuah());
        
        pd.menuPilihan();
        
    }
}
