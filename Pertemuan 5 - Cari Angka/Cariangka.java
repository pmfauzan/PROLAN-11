import java.util.Scanner;
public class Cariangka{
  Scanner input = new Scanner(System.in);

  //Var
  int angka, angka2;
  char Pilihan;
  int max;
  int min;

  public void Banyakangka(){
    System.out.print("Banyak angka yang di ingin : ");
    angka = input.nextInt();
    for(int i=0; i<angka; i++){
      System.out.print("Masukan angka : ");
      angka2 = input.nextInt();
    }
  }//endprocedure Banyakangka
  public void Pilihan (){
    System.out.print("Masukan Pilihan anda [A atau B]");
    Pilihan = input.next().charAt(0);
    if(Pilihan == 'A' || Pilihan == 'a'){
      System.out.println("Pencarian nilai minimum");
    }else if(Pilihan == 'B'|| Pilihan =='b'){
      System.out.println("Pencarian nilai maksimum");
    }//endif
  }//endprocedure Pilihan
  public static void main(String[]args){
    Cariangka cari = new Cariangka();
    cari.Banyakangka();
    cari.Pilihan();
  }//endprocedure main
}
