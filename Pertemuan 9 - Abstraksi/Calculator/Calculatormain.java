import java.util.Scanner;
class Calculatormain{
	public static void main(String args[]){
	double operan1, operan2;
	Hitung cal = new Hitung();

	Scanner input = new Scanner(System.in);
	System.out.print("masukan angka pertama : ");
	operan1 = input.nextDouble();
	System.out.print("masukan angka kedua : ");
	operan2 = input.nextDouble();

	System.out.println("Hasil pertambahan adalah : "+ cal.hasilTambah(operan1, operan2));
	System.out.println("Hasil pengurangan adalah : "+ cal.hasilKurang(operan1, operan2));
	System.out.println("Hasil perkalian adalah : "+ cal.hasilKali(operan1, operan2));
	System.out.println("Hasil pembagian adalah : "+ cal.hasilBagi(operan1, operan2));
	}
}
