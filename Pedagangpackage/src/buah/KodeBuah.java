package buah;
public class KodeBuah <T> {
    private T kode;
    
    public T getKode(){
        return kode;
    }
    public void setKode(T kode){
        this.kode = kode;
    }
    public static void printKode(){
        KodeBuah<String> kb = new KodeBuah();
        kb.setKode("2112");
        System.out.println(kb.getKode());
    }
    public static <T> void kodeSemangka(T semangkakode){
        System.out.println("Kode buah semangka : "+semangkakode);
    }
    
    public static <T> void kodeMelon(T melonkode){
        System.out.println("Kode buah melon    : "+melonkode);
    }
}
