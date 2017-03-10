import java.util.Scanner;
class Buah{
  Scanner input = new Scanner (System.in);
  void Jenisbuah(){
    System.out.println("Jenis buah yang kami punya");
    System.out.println("------------------------------------");
    System.out.println("1. Alpukat");
    System.out.println("2. Mangga");
    System.out.println("3. Apel");
    System.out.println("4. Melon");
    System.out.println("------------------------------------");
  }
  void Namabuah(){
    String Nbuah;
    System.out.println("------------------------------------");
    System.out.println("Tulis nama buah yang ingin dibeli");
    System.out.print("Nama buah :");
    Nbuah = input.nextLine();
    System.out.println("------------------------------------");
    System.out.println("Buah                                            : " + Nbuah);

  }
}
