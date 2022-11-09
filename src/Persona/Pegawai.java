package Persona;

import java.util.Date;

public class Pegawai extends Persona {
	protected String office;
	protected int salary;
	protected Date tanggalRekrut;
	
	@Override
	public String toString() {
		return "Pegawai memiliki nama " + nama + ", alamat " + address + ", nomor telepon " + phoneNumber 
				+ ", email " + email + ", office" + office + ", salary " + salary + ", tanggal rekrut " + tanggalRekrut.getDay() 
				+ "-" + tanggalRekrut.getMonth() + "-" + tanggalRekrut.getYear();
	}

	public Pegawai(String nama, String address, String phoneNumber, String email, String office, int salary,
			Date tanggalRekrut) {
		super(nama, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.tanggalRekrut = tanggalRekrut;
	}
}
