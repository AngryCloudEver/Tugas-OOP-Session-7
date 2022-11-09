package Persona;

public class Persona {
	protected String nama;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	public String toString() {
		return "Persona memiliki nama " + nama + ", alamat " + address + ", nomor telepon " + phoneNumber + ", email " + email;
	}

	public Persona(String nama, String address, String phoneNumber, String email) {
		super();
		this.nama = nama;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
}
