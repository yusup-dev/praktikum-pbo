package praktikum1;
import java.util.Scanner;

public class Latihan {
  public static void main(String args[]) {
//	  System.out.println("Hello World");
//	  inisialisasi variable
	  int angka1, angka2, hasil;
	  
//	  inisalasi input user
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("===================");
	  System.out.print("Operasi Angka");
	  System.out.println("===================");
//	  inputan user
	  System.out.print("Masukkan Angka 1 : ");
	  angka1 = input.nextInt();
	  
	  System.out.print("Masukkan Angka 2 : ");
	  angka2 = input.nextInt();
	  
//	  hasil inputan
	  hasil = angka1 + angka2;
	  System.out.println("Hasilnya : "+ hasil);
	  System.out.println("===================");
	  System.out.println("Inputan Name");
	  System.out.println("===================");
	  String firstName, lastName, fullName;
	  
	  
	  System.out.print("Masukkan Nama Depan : ");
	  firstName = input.next();
	  
	  System.out.print("Masukkan Nama Belakang : ");
	  lastName = input.next();
	  
	  fullName = firstName + " " + lastName;
	  System.out.print("Nama Lengkap Kamu : "+ fullName);
	 
  }
}
