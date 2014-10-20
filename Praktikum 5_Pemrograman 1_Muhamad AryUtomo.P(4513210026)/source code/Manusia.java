public class Manusia {
	public String nama;
	public static void main(String [] args) {
		Manusia orang = new Manusia();
		orang.setNama("Ary");
		System.out.println("Namaku adalah = " + orang.getNama());
	}
	
	public void setNama(String namaku) {
		this.nama = namaku;
	}
	
	public String getNama() {
		return this.nama;
	}
}