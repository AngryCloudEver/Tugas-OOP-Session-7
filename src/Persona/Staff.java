package Persona;

import java.util.Date;

public class Staff extends Pegawai {
	private String title;

	@Override
	public String toString() {
		return "Pegawai memiliki nama " + nama + ", alamat " + address + ", nomor telepon " + phoneNumber 
				+ ", email " + email + ", office" + office + ", salary " + salary + ", tanggal rekrut " + tanggalRekrut.getDay() 
				+ "-" + tanggalRekrut.getMonth() + "-" + tanggalRekrut.getYear() + ", title " + title;
	}
	
	public Staff(String nama, String address, String phoneNumber, String email, String office, int salary,
			Date tanggalRekrut, String title) {
		super(nama, address, phoneNumber, email, office, salary, tanggalRekrut);
		this.title = title;
	}
}
