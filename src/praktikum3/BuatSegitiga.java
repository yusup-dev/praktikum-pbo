package praktikum3;

import java.util.Scanner;

public class BuatSegitiga {
	public static int inputData() {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.print("Masukkan Angka ");
		data = input.nextInt();
		return data;
	}
	
	public static void buatsegitiga(int ulang) {
		for(int i = 1; i <= ulang; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}
	public static void main(String args[]) {
		int ulang = inputData();
		buatsegitiga(ulang);
		System.out.println("Tinggi Segitiga = " + ulang);
	}
}
