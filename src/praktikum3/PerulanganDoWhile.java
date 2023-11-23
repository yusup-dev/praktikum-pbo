package praktikum3;

public class PerulanganDoWhile {
	/*
	 * inisialisasi
	 * do{
	 * 
	 * increment
	 * }while(kondisi)
	 * */
	
	public static void main(String args[]) {
		int angka = 5;
//		dikerjainnya apa
		do {
			System.out.println("Angka ke-" + angka);
			angka++;
//		berhenti sampai -
		}while(angka<=50);
	}
}
