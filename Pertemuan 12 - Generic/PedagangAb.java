
public abstract class PedagangAb implements BuahInterface {
    protected String nama= "TOKO BUAH ASANKA";
    
    protected String getNama(){
        return nama;
    }
    public abstract void printNama();
    //interface
    @Override
    public void tentangSemangka(){
        System.out.println("Semangka, buah segar penuh cita rasa. Sangat pas ketika cuaca panas");
        
    }
    @Override
    public void tentangMelon(){
        System.out.println("Melon, buah hijau ini memiliki rasa yang manis, seperti melon");
    }
    @Override
    public void tentangPapaya(){
        System.out.println("Papaya, buah yang authentic seperti kifurai");
    }
}
