import java.util.Scanner;
public class hitung {
	public static void main (String [] args){
	String nama;
	String NPM;
	int NilaiTugas1;
	int NilaiTugas2;
	float NilaiRata;
	float NilaiRatarata;
	
		Scanner masuk = new Scanner (System.in);
		System.out.println("Masukan nama  = ");
		nama= masuk.nextLine();
		System.out.println("Masukan NPM =");
		NPM = masuk.nextLine();
		System.out.println("Masukan Nilai tugas1=");
		NilaiTugas1 = masuk.nextInt();
		System.out.println("Masukan Nilai tugas2=");
		NilaiTugas2= masuk.nextInt();
		System.out.println("rata-rata=");
		NilaiRata= NilaiTugas1+NilaiTugas2;
		NilaiRatarata= NilaiRata/2;
		System.out.println (nama);
		System.out.println  (NPM);
		System.out.println  (NilaiRatarata);
		
		}
		}
