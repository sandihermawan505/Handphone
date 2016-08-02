import java.util.*;
class Handphone
{
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Handphone hp = new Handphone();
		
		System.out.print("Masukkan merk hendphone: ");
		hp.setMerk(input.nextLine());
		System.out.print("Masukkan tipe hendphone: ");
		hp.setTipe(input.nextLine());
		System.out.print("Masukkan warna hendphone: ");
		hp.setWarna(input.nextLine());
		System.out.print("Masukkan harga hendphone: ");
		hp.setHarga(input.nextInt());
		
		System.out.println("\n======================================");
		System.out.println("Daftar harga ponsel dan spesifikasinya");
		System.out.println("======================================");
		System.out.println("Merk HP: "+hp.getMerk());
		System.out.println("Tipe HP: "+hp.getTipe());
		System.out.println("Warna HP: "+hp.getWarna());
		System.out.println("harga HP sebelum diskon : "+hp.getHarga());
		hp.keterangan();
}
	
//deklarasi
private String merk, tipe, warna;
private double harga;
	//setter
	public void setMerk(String merk)
	{
	this.merk=merk;
	}
	public void setTipe(String tipe)
	{
	this.tipe=tipe;
	}
	public void setWarna(String warna)
	{
	this.warna=warna;
	}
	public void setHarga(double harga)
	{
	this.harga=harga;
	}
//getter
public String getMerk()
{
return merk;
}
public String getTipe()
{
return tipe;
}
public String getWarna()
{
return warna;
}
public double getHarga()
{
return harga;
}
	//method_tambahan
	public double HargaDiskon()
	{
	double diskon= 0.1*getHarga();
	double total= getHarga()-diskon;
	return total;
	}
	public void keterangan()
	{
	System.out.println ("Harga HP sesudah diskon (10%) = RP"+ HargaDiskon());
	}
}