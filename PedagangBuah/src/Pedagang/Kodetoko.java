
package Pedagang;

public class Kodetoko<T> {
    private T kodeToko;
    
    public T getKodetoko(){
        return kodeToko;
    }
    public void setKodetoko(T kodeToko){
        this.kodeToko = kodeToko;
    }
    public static void tampilKode(){
        Kodetoko <String> kt = new Kodetoko();
        kt.setKodetoko("F2112LIA");
        System.out.println("Kode Toko Buah      : "+kt.getKodetoko());
        System.out.println("--------------------------------------------------");
    }
}
