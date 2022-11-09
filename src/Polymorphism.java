class Orang{
	public void status() {
		System.out.println("Saya adalah manusia");
	}
}

class Mahasiswa extends Orang{
	@Override
	public void status() {
		System.out.println("Saya di universitas menjadi seorang mahasiswa");
	}
}

class AnakBerbakti extends Orang{
	@Override
	public void status() {
		System.out.println("Saya di rumah menjadi seorang anak yang berbakti");
	}
}

public class Polymorphism {
	
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		
		mhs.status();

		AnakBerbakti ank = new AnakBerbakti();
		ank.status();
	}

}
