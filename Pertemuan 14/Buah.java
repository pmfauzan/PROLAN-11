
public class Buah extends PedagangAb {

    public void namaBuah(){
        System.out.println("1. Semangka");
        System.out.println("2. Melon");
        System.out.println("3. Papaya");
    }

    public void printNama() {
        System.out.println(getNama());
    }

    @Override
    public void tentangSemangka() {
        super.tentangSemangka();
    }
    public void tentangMelon(){
        super.tentangMelon();
    }
 }

