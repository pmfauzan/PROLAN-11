import java.util.Scanner;

public class Mahasiswa{
  public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    Mahasiswa Ipk = new Mahasiswa();

    //Var
    int BanyakMhs = 0;
    int Lulus = 0;
    int Gagal = 0;

    float nilai = 0;
    float jumlah = 0;
    float ratarata = 0;

    System.out.print("Silahkan masukkan nilai ipk : ");
    nilai = input.nextFloat();

    while(nilai != -999){
      if(Ipk.isWithinRange(nilai,0,4)==1){
        BanyakMhs++;
        if(nilai >= 2.75){
          Lulus++;
        } else {
          Gagal++;
        }
          jumlah += nilai;
    }
    System.out.print("Silahkan masukkan nilai ipk : ");
    nilai = input.nextFloat();
  }
  ratarata = jumlah / BanyakMhs;

  System.out.println("Mahasiswa yang lulus : "+ Lulus);
  System.out.println("Mahasiswa yang tidak lulus : "+ Gagal);
  System.out.println("Nilai Rata-rata : "+ ratarata);
  System.out.println("Banyak Mahasiswa : "+ BanyakMhs);
}
  //Fungsi Int isWithinRange
  public int isWithinRange(float x, int min, int max){
		if(x >= min && x <= max){
			return 1;
		}else{
			return 0;
		}
	}

}
