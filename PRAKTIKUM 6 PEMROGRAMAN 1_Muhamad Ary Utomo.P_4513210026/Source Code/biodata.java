import java.math.*;

class biodata {
	String Nama;
	String Fakultas;
	String Hoby;
	BigInteger Npm;
	
	public String getNama(){
		return Nama;
	
	}
	public BigInteger getNpm(){
		return Npm;
	}
	public String getFakultas(){
		return Fakultas;
	}
	public String getHoby(){
		return Hoby;
	}
	
	public void setNama(String a){
		this.Nama=a;
	}
	public void setFakultas(String b){
		this.Fakultas=b;
	}
	public void setHoby(String c){
		this.Hoby=c;
	}
	public void setNpm(BigInteger x){
		this.Npm=x;
	}
	
	public static void main(String[]args){
	biodata biodatasaya=new biodata();
	biodatasaya.setNama("Muhamad Ary Utomo.P");
	System.out.print("Nama Anda Adalah :");
	System.out.println(biodatasaya.getNama());
	
	biodatasaya.setFakultas("Teknik Informatika");
	System.out.print("Fakultas Anda Adalah :");
	System.out.println(biodatasaya.getFakultas());
	
	biodatasaya.setHoby("Bermain Basket");
	System.out.print("Hoby Anda Adalah :");
	System.out.println(biodatasaya.getHoby());
	
	biodatasaya.setNpm(new BigInteger("4513210026"));
	System.out.print("Npm anda adalah :");
	System.out.print(biodatasaya.getNpm ());
	}
}