package Persona;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Persona pers = new Persona("Roger", "Jakarta", "087781098223", "rogerangryawan111@gmail.com");
		System.out.println(pers.toString());
		
		Murid mur = new Murid("Roger", "Jakarta", "087781098223", "rogerangryawan111@gmail.com", "Freshmen");
		System.out.println(mur.toString());
		
		Date date = new Date(2022, 7, 15);
		
		Pegawai peg = new Pegawai("Roger", "Jakarta", "087781098223", "rogerangryawan111@gmail.com", "Kantor A", 5000000, date);
		System.out.println(peg.toString());
		
		Dosen dos = new Dosen("Roger", "Jakarta", "087781098223", "rogerangryawan111@gmail.com", "Kantor A", 5000000, date, 7, "Karyawan");
		System.out.println(dos.toString());
		
		Staff sta = new Staff("Roger", "Jakarta", "087781098223", "rogerangryawan111@gmail.com", "Kantor A", 5000000, date, "OB");
		System.out.println(sta.toString());
	}

}
