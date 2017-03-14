public class Pedagang2{
  public static void main(String[]args){
    //Pemanggilan konstraktor
    Namapedagang Asanka = new Namapedagang();
    System.out.println(Asanka.nama);
    //Method
    Pedagang2 method = new Pedagang2();
    method.methodTampilkan();
    method.methodTampilkan2("Dilarang kasbon, kasbon bayar 2x lipat");
    System.out.println(method.kembalikanNilai());
    System.out.println(method.tambahkanNilai(15000, 2));
    //MethodOverloading
    Pedagang2 method2 = new Pedagang2();
    method.methodTampilkan("Buahnya enak");
    method.methodTampilkan("Segar dan ", "Manis");

  }
  private void methodTampilkan() {
      System.out.println("Selamat datang di toko buah Asanka");
      }

  //method tidak mengembalikan nilai dengan parameter
  private void methodTampilkan2(String nama) {
      System.out.println(nama);
  }
  //method mengembalikan nilai tanpa parameter
  private int kembalikanNilai() {
      return 15000;
  }
  //method mengembalikan nilai dengan parameter
  private int tambahkanNilai (int x, int y) {
      return x * y;
  }
  //Method Over loading
  private void methodTampilkan(String nama) {
    System.out.println(nama);
  }
  private void methodTampilkan (String nama1, String nama2) {
    System.out.println(nama1+nama2);
  }
  //Penggunaan this
  public class Penggunaanthis{
    String Nama;
    public Penggunaanthis(){
      this("java");
      this.Nama = "Asanka Putra";
    }
    public Penggunaanthis(String Nama){
      this.Nama = Nama;
    }
  }
}
