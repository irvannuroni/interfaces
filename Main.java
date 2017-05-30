public class main {

public static void main (String[] args) {
	
	socket nuklir = new TenagaNuklir();
	socket panas = new TenagaPanas();

	nuklir.HitungTenaga();
	panas.HitungTenaga();
	}
}