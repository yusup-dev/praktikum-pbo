package praktikum2;

import java.util.Scanner;

public class Penkondisian {
	public static void main(String args[]) {
//		inisialisation 
		
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perhitungan;
//		input user
		System.out.print("Masukkan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukkan Angka 2 : ");
		angka2 = input.nextInt();
		
		System.out.print("List perhitungan : " 
				+ "\n 1 : Petambahan"
				+ "\n 2 : Pengurangan"
				+ "\n 3 : Perkalian"
				+ "\n 4 : Pembagian"
				+ "\n Masukkan Angka Perhitungan : "
				);
		
		perhitungan = input.nextInt();
		
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
		}else if(perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
		}else if(perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
		}else if(perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.print("Hasilnya adalah : "+ hasil);
		}else {
			System.out.print("Angka yang dimasukkan anda salah!!!");
		}
		
		
	}
}
