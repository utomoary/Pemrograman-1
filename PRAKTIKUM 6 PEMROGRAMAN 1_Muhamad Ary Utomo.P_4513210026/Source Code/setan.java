
 public class setan{
	public String Nama ;
		
		public String getNama(){
				return Nama;
		}
		public void setNama(String x){
				this.Nama=x;
		}
		public static void main(String[] args){
				setan setanPertama = new setan();
				setanPertama.setNama("Muhamad Ary Utomo");
				System.out.print("Nama Anda adalah : ");
				System.out.print(setanPertama.getNama());
		}
		
}