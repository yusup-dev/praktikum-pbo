package praktikum2;

import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String args[]) {
//		inisialisation 
		
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil;
		String perhitungan;
//		input user
		System.out.print("Masukkan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukkan Angka 2 : ");
		angka2 = input.nextInt();
		
		System.out.print("List perhitungan : " 
				+ "\n + : Petambahan"
				+ "\n - : Pengurangan"
				+ "\n * : Perkalian"
				+ "\n / : Pembagian"
				+ "\n Masukkan Angka Perhitungan : "
				);
		
		perhitungan = input.next();
	
		switch(perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
			break;
		default: 
			System.out.print("Simbol yang dimasukkan tidak sesuai");
		}
		
		
		
		
	}
}
