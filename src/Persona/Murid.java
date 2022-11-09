package Persona;

public class Murid extends Persona {
	private String status;
	
	@Override
	public String toString() {
		return "Murid memiliki nama " + nama + ", alamat " + address + ", nomor telepon "
				+ phoneNumber + ", email " + email + ", dan status " + status;
	}

	public Murid(String nama, String address, String phoneNumber, String email, String status) {
		super(nama, address, phoneNumber, email);
		this.status = status;
	}
}
