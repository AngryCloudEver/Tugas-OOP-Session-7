package Persona;

import java.util.Date;

public class Dosen extends Pegawai {
	private int officeHours;
	private String jabatan;
	
	@Override
	public String toString() {
		return "Pegawai memiliki nama " + nama + ", alamat " + address + ", nomor telepon " + phoneNumber 
				+ ", email " + email + ", office" + office + ", salary " + salary + ", tanggal rekrut " + tanggalRekrut.getDay() 
				+ "-" + tanggalRekrut.getMonth() + "-" + tanggalRekrut.getYear() + ", office hours " + officeHours +
				", jabatan " + jabatan;
	}
	
	public Dosen(String nama, String address, String phoneNumber, String email, String office, int salary,
			Date tanggalRekrut, int officeHours, String jabatan) {
		super(nama, address, phoneNumber, email, office, salary, tanggalRekrut);
		this.officeHours = officeHours;
		this.jabatan = jabatan;
	}
}
