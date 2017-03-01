import java.util.Scanner;

class InputOutput2{
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	String nama;
	char JenisKelamin;
	int tinggibadan;
	boolean menikah;
	String ketMenikah;
	
	System.out.println();
	System.out.print("Masukkan Nama                         : ");
	nama = input.nextLine();
	
	System.out.print("Masukkan Jenis Kelamin                : ");
	JenisKelamin = input.next().charAt(0);
	
	System.out.print("Masukkan Tinggi Badan                 : ");
	tinggibadan = input.nextInt();
	
	System.out.print("Masukkan Status Menikah [true/false]  : ");
	menikah = input.nextBoolean();
	
	if (menikah=true) {ketMenikah = "Ciee  udah gak jomblo";} else
	{ketMenikah = "Cie jomblo";}

	System.out.println();
	System.out.println("--------------------------------");
	System.out.println("Nama Anda      : " + nama);
	System.out.println("Kelamin anda   : " + JenisKelamin);
	System.out.println("Tinggi badan   : " + tinggibadan + " cm");
	System.out.println("Status Menikah : " + ketMenikah);
	
	}
}