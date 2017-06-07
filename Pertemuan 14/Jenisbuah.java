
public class Jenisbuah {
    public static <T> void namaJenis(T nama){
        System.out.println(nama);
    }
    public static<T> void kodeJenis(T kode){
        System.out.println(kode);
    }
    public static <T extends Comparable<T>> void jenisRasa(T x, T y){
        System.out.println(x);
        System.out.println(y);
    }
}
