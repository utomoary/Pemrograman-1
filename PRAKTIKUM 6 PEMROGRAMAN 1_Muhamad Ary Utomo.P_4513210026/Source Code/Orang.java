public class Orang{
	public String Nama ;
	
	public String getNama(){
			return Nama;
	}
	public void setNama(String x){
				this.Nama=x;
	}
	public static void main (String[] args){
			Orang OrangPertama=new Orang();
			OrangPertama.setNama("Muhamad Ary Utomo");
			System.out.print("Nama Anda Adalah : ");
			System.out.print(OrangPertama.getNama());
	}
}