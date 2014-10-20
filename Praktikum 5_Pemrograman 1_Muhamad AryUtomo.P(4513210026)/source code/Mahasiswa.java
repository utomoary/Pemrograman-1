public class Mahasiswa {
	int nilai;
	public static void main(String [] args) {
		Mahasiswa orang = new Mahasiswa();
		orang.setNilai(98);
		System.out.println("Nilaiku adalah = " + orang.getNilai());
	}
	
	public void setNilai(int nilaiku) {
		this.nilai = nilaiku;
	}
	
	public int getNilai() {
		return this.nilai;
	}
}